import java.util.Scanner;
public class Magic_Number{
    public static void main(String [] args){
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