import javax.swing.*;

public class Main{
    public static void main(String [] args){
        String name = JOptionPane.showInputDialog("What is your name?");
        JOptionPane.showMessageDialog(null, new Hello().greet(name));
    }
}