import javax.swing.JOptionPane;
public class Condition_Program_2{
public static void main(String [] args){
String word= JOptionPane.showInputDialog("Type a word");

if (word.equals("Surprise!")||word.equals("surprise!")){
System.out.println("Wow! Nice surprise, I'm shocked");
}
else{
    System.out.println("Not surprisingly, I don't get a surprise");
}


}

}
