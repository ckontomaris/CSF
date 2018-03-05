import javax.swing.JOptionPane;
public class A_Better_Count{
public static void main(String [] args){
String startstring= JOptionPane.showInputDialog("Type a starting number and I will print out all integers from the start to end values");
String endstring= JOptionPane.showInputDialog("Type an end number and I will print out all integers from the start to end values");
int start= Integer.parseInt(startstring);
int end= Integer.parseInt(endstring);

System.out.println("Start number: "+start);
System.out.println("End number: "+end);
//checks if it starts or ends higher, so will it need to count down or up
if (start<end){
    // <= so that it stops as the start int gets higher until it reaches the end
while(start<=end){
   System.out.println(start);
    start++;
    }}
else if (start>end){
    // now  runs until endint is incrementally counted up by 1 to the startint (that was higher)
while (start>=end){
System.out.println(start);
start=start-1;
}
}
else{
    System.out.println("I can't count from something to itself!");
}


}
}
