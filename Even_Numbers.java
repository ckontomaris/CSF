import javax.swing.JOptionPane;
public class Even_Numbers{
public static void main(String [] args){
String orig= JOptionPane.showInputDialog("Type a number and I will print out all even numbers from 0 to the number you typed!");
int number= Integer.parseInt(orig);
int two=2;
System.out.println(0);
//while we havent reached the number inputted, keep adding two to find the original  
while(number>=two){
   System.out.println(two);
    two=two+2;
    }


}
}
