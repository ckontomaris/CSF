import javax.swing.JOptionPane;
public class Sum_Sums{
    public static void main(String [] args){
        //new way to iput directly without making a string first
        int n= Integer.parseInt(JOptionPane.showInputDialog("What do you want to sum-i-fy?"));
        int placeholder=n;
        System.out.println("We will sum-i-fy "+n);
    
        //compute sum of 1 to N
        System.out.println("Add numbers from 1 to "+n);
        int currentsumval=0;
        while (n>=1){
            currentsumval= currentsumval+n;
            System.out.print(n+" + ");
            n=n-1;
        }
        System.out.print(" = "+currentsumval);
        System.out.println(" ");
    
        n=placeholder;
        //compute odd integers, check if original number is even, and if so, make it the closest lower odd
        if (n%2==0) {
            n=n-1;
        }
   
        System.out.println("Add all odd numbers from 1 to "+placeholder);
        int currentoddval=0; 
        while (n>=1){
            currentoddval= currentoddval+n;
            System.out.print(n+" + ");
            n=n-2;
    
        }
        System.out.print(" = "+currentoddval);
        System.out.println(" ");
    
        //sum of all even integers
        n=placeholder;
        System.out.println("Add all even numbers from 1 to "+placeholder);
        //check if original input number is even or odd and set  up for loop 
        if (n%2==1) {
            n=n-1;
        } 
        int currentevenval= 0;
        while (n>=1){
            //+= just adds n to the current
            currentevenval += n;
            System.out.print(n+" + ");
            n=n-2;
    
        }
        System.out.print(" = "+currentevenval);
  
    
    }
}