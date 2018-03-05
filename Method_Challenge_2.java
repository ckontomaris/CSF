import javax.swing.JOptionPane;
//for magic number needs scanner
import java.util.Scanner;



//add loop to bring back to start option when done, or if types else
public class Method_Challenge_2{
    public static void main(String [] args){
    int menuchoice= Integer.parseInt(JOptionPane.showInputDialog("If you want a calculator, Type 1 \n" + 
    "For The count, press 2 \n" +
    "For a magic number game, press 3 \n"+ 
    "To quit, press 4"));
    //make an option for areas and then call a method that asks which area and does it
    if (menuchoice==1){
        Calculator_Method();
    
    }
    else if (menuchoice==2){
    A_Better_Count();
    }
    else if (menuchoice==3){
    Magic_Number();
    }
    else if (menuchoice==4){
    System.out.println("Nothing to see here, have a great day.");
    
   }
   else {
   System.out.println("Sorry, that wasn't an option :/");  
    }
}
public static void Calculator_Method(){
   String operator= JOptionPane.showInputDialog("Type an opeartor to use!(+ - * / %)");
    if (operator.equals("+")||operator.equals("-")||operator.equals("*")||operator.equals("/")){
        String orignum1 = JOptionPane.showInputDialog("Type in the first number to calculate with");
    String orignum2 = JOptionPane.showInputDialog("Type in the second number to calculate with");
    double num1 = Double.parseDouble(orignum1);
    double num2 = Double.parseDouble(orignum2);
  
    if (operator.equals("+")){
        System.out.println(orignum1 +" + "+ orignum2+" = " + (num1+num2));}
        else if (operator.equals("-")){System.out.println(orignum1 +" - "+ orignum2+" = " + (num1-num2));}
        
    else if (operator.equals("-")){ System.out.println(orignum1 +" - "+ orignum2+" = " + (num1-num2));}
    
    else if (operator.equals("*")){System.out.println(orignum1 +" * "+ orignum2+" = " + (num1*num2));}

    else if (operator.equals("/")){System.out.println(orignum1 +" / "+ orignum2+" = " + (num1/num2));}
    }
    else if (operator.equals("%")){
       String orignum1 = JOptionPane.showInputDialog("Type in the first integer to calculate with");
    String orignum2 = JOptionPane.showInputDialog("Type in the second integer to calculate with");
    int num1 = Integer.parseInt(orignum1);
    int num2 = Integer.parseInt(orignum2);
    System.out.println(orignum1 +" % "+ orignum2+" = " + (num1%num2));}
        else {
            System.out.println("That's not an operation!");
        }}
 

public static void A_Better_Count(){
String startstring= JOptionPane.showInputDialog("Type a starting number and I will print out all integers from the start to end values");
String endstring= JOptionPane.showInputDialog("Type an end number and I will print out all integers from the start to end values");
int start= Integer.parseInt(startstring);
int end= Integer.parseInt(endstring);

System.out.println("Start number: "+start);
System.out.println("End number: "+end);
//checks if it starts or ends higher, so will it need to count down or up
if (start<end){
    // <= so that it stops as the start int gets higher until it reaches the end
while(start<=end){
   System.out.println(start);
    start++;
    }}
else if (start>end){
    // now  runs until endint is incrementally counted up by 1 to the startint (that was higher)
while (start>=end){
System.out.println(start);
start=start-1;
}
}
else{
    System.out.println("I can't count from something to itself!");
}
}

 public static void Magic_Number(){
        //create a random integer to compare with user
        int random= (int)(Math.random() * 10 + 1);
        int input=0;
        //scanner for user to put in number, in a loop so that if the user types the wrong number it repears
        while (input!=random){
        System.out.println("Alright, see if you can guess the number, if you don't, you get ∞ more tries!" );
        Scanner sc= new Scanner(System.in);
        input= sc.nextInt();
        
        }
        System.out.println("You did it, great job!!!!!!!!");
    }
}
