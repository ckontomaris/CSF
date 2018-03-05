import javax.swing.JOptionPane;
public class MultChoice
{
    public static void main(String [] args) {
        String temp = JOptionPane.showInputDialog(
                "Do you want to multiply two numbers?\n" +
                "1. Yes\n" +
                "2. No" );
        int choice = Integer.parseInt(temp);
        if (choice == 1) {
            doMulty();
        } else {
            System.out.println("OK, Goodbye.");
        }
    }

    public static void doMulty() {
        String temp = JOptionPane.showInputDialog("1st #?");
        double q = Integer.parseInt(temp);
        temp = JOptionPane.showInputDialog("2nd #?");
        double w = Integer.parseInt(temp);
        System.out.println("Your answer is " + (q * w));
    }
}

 //Write a program that lets a user choose if they want to multiply two doubles.
        //If they do, then the program asks the user for two numbers and then prints the results of multiplying the two numbers. 
        //If they don’t, then the program should just exit with a message.