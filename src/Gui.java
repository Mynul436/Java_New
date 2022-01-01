import javax.swing.JOptionPane;
//import  javax.swing.JOptionPane;
public class Gui {
    public static void main(String[] args) {
        String name=JOptionPane.showInputDialog("Enter your message:");
        JOptionPane.showMessageDialog(null,"Hello "+name);
        int age=Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        JOptionPane.showMessageDialog(null,"Your age is "+age+" years old");

    }
}
