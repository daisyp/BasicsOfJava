package gui;

import javax.swing.JFrame;

public class MainJButton {
    public static void main(String[] args) {

        IntroJButton go = new IntroJButton();
        go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        go.setSize(300, 200);
        go.setVisible(true);
    }
}
