package gui;

import javax.swing.JFrame;

public class MainJFrame {

    public static void main(String[] args) {

        IntroJframe smth = new IntroJframe();
        smth.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x-kasutad lõpetab programmi
        smth.setSize(275, 180);
        smth.setVisible(true); // tänu sellele näen seda

    }
}
