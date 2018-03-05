import javax.swing.JOptionPane;

public class Inputty2
{
    public static void main(String [] args)
    {
        String zin = JOptionPane.showInputDialog("Type an Integer!");
        int waam = Integer.parseInt(zin);
        
        System.out.println(waam+" times ten is "+waam*10);
    }
}
