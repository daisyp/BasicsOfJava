package gui;

import javax.swing.JOptionPane;
/**
 * Created by Daisy on 28.11.2015.
 */
public class IntroductionGui {
    public static void main(String[] args) {

        String fnum = JOptionPane.showInputDialog("Enter first number");
        String snum = JOptionPane.showInputDialog("Enter second number");

        int num1 = Integer.parseInt(fnum);
        int num2 = Integer.parseInt(snum);
        int sum = num1 + num2;

        JOptionPane.showMessageDialog(null, "The answer is" + sum, "the title", JOptionPane.PLAIN_MESSAGE);


    }
}
