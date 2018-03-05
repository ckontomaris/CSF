import javax.swing.JOptionPane;
public class Multiplicator{
public static void main(String [] args)
{ String integer1 = JOptionPane.showInputDialog("Type the numerator of the first fraction");
  String integer2 = JOptionPane.showInputDialog("Type the denominator of the first fraction");
  String integer3 = JOptionPane.showInputDialog("Type the numerator of the second fraction");
  String integer4 = JOptionPane.showInputDialog("Type the denominator of the second fraction");
  
  double double1= (Double.parseDouble(integer1))/(Double.parseDouble(integer2));
  double double2= (Double.parseDouble(integer3))/(Double.parseDouble(integer4));
  System.out.println(integer1+"/"+integer2+" * "+ integer3+"/"+integer4+ " = "+(double1*double2));


}
}