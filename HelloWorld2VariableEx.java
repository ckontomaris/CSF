/**
 * HelloWorld2
 * This program demonstrates how to use variables in Java.
 */
public class HelloWorld2VariableEx

{
    public static void main()
    {
        String s;
        s = "Hello World! Again!";
        
        int x = 3095;
        
        double z = 10.55;
        
        System.out.println(s);
        System.out.println(x);
        System.out.println(z);
        
        x = x + 10;
        z = z * 2;
        
        System.out.println(x + z);
        System.out.println(x + " " + z);
        
        z = (x + 3) / z;
        
        System.out.println(z);
        
        x = x % 12;
        
        System.out.println(x);
    }
}