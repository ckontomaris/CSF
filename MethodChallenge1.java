import javax.swing.JOptionPane; 

public class MethodChallenge1 { 
    public static void main (String [] args) { 
        String s = JOptionPane.showInputDialog("Radius?"); 
        double r = Double.parseDouble(s); 
        double area = circArea(r); 
        System.out.println("The area of the circle is " + area); 
    }
        public static double circArea(double rad) 
        { 
            return Math.PI*(rad*rad);
            /* WHAT GOES HERE? 
            Copy and paste the code, then replace the WHAT GOES HERE? comment 
            with code which will return the area of a circle with a radius as the parameter. 
            Use Math.PI (capital p, capital i) for pi.

            Hint: You may have already completed a program similar to this.
            */
        }
    }