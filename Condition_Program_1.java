import javax.swing.JOptionPane;

public class Condition_Program_1 {
public static void main(String [] args){
    
    String orig =JOptionPane.showInputDialog("Put in a number to compare");
    double compared= Double.parseDouble(orig);
    
    if (compared <= 10){
    
        System.out.println(orig+ " is less than or equal to 10!!!");}
    else if (compared >= 20){
        System.out.println(orig+ " is greater than or equal to 20!!!");
    }
    else {
    System.out.println(orig + " is not less than or equal to 10 or greater than or equal to 20!!!! What a weird number!");}
}

}