import javax.swing.JOptionPane;

public class Mad_Libs
{
    public static void main(String [] args)
    {
        String verb1  = JOptionPane.showInputDialog("Gimme a verb");
        String verb2  = JOptionPane.showInputDialog("Gimme another verb");
        String noun1= JOptionPane.showInputDialog("Gimme a noun");
        String noun2= JOptionPane.showInputDialog("Another noun");
        String place= JOptionPane.showInputDialog("Gimme a place");
        String adj1= JOptionPane.showInputDialog("Gimme an adjective");
        String adj2= JOptionPane.showInputDialog("Another adjective");
        String adj3= JOptionPane.showInputDialog("What is another adjective for big");
        
        System.out.println("Once upon a time, there was a "+adj1+" " + noun1+ "." +" One day, the " +noun1 +" went to "+place+".");
        System.out.println(" At this place, it met a "+adj2+" " +noun2+"." +" The " +adj2+" "+noun2+" was also very " +adj3+" and wanted to "+ verb2+" a "+ adj3+" "+noun2+ ".");
        System.out.println("After the "+noun1+" and "+noun2+" met, they decided to "+ verb2+" some dinner.");
        System.out.println("This is where the story of the beloved "+noun1+" and "+noun2+" ends, becuase the programmer is too lazy to continue and wants to move on.");
    }
}
