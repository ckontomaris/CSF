import javax.swing.JOptionPane;
public class Condition_Program_3_Calculator{
    public static void main(String [] args){
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
        }
    }
}