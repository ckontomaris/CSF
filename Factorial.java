import javax.swing.JOptionPane;
public class Factorial{
    public static void main(String [] args){
        int usernum =Integer.parseInt(JOptionPane.showInputDialog("Gimme a number to factorialize"));
        int currentval=1;
            while (usernum>0){
                //multiply 1 by a variable and then add 1 to the variable and run again 
                currentval= currentval*(usernum);
                //prints before subtracting from usernum, so that it truly reflects the process occuring
                System.out.print((usernum)+" * ");
                usernum=usernum-1;
    }
    System.out.println("= "+currentval);
}
}