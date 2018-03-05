// import tells Java to activate a feture
//Joptionpane opens windows and allows users to open windows/input its it used twice
import javax.swing.JOptionPane;

public class Inputty
{
    public static void main(String [] args)
    {
        String zin = JOptionPane.showInputDialog("Type something!");
        
        System.out.println("You typed:" + zin);
    }
}
