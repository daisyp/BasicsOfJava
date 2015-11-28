package gui;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class IntroJframe extends JFrame{

    private JLabel item1;

    public IntroJframe() {
        super("The title bar");
        setLayout(new FlowLayout()); // default layout

        item1 = new JLabel("THIS IS A SENTENCE");
        item1.setToolTipText("This is gonna show up on hover");
        add(item1);

    }


}
