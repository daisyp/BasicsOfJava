package gui;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class IntroJButton extends JFrame{

    private JButton regular;
    private JButton custom;

    public IntroJButton() {
        super("The title");
        setLayout(new FlowLayout());

        regular = new JButton("Reg Button");
        add(regular);

        // piltide lisamine
        Icon b = new ImageIcon(getClass().getResource("red.png"));
        Icon x = new ImageIcon(getClass().getResource("x.png"));
        custom = new JButton("Custom", b);
        custom.setRolloverIcon(x);
        add(custom);

        HandlerClass handler = new HandlerClass();
        regular.addActionListener(handler);
        custom.addActionListener(handler);

    }// end of constructor

    private class HandlerClass implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            JOptionPane.showMessageDialog(null, String.format("%s", event.getActionCommand()));

        }

    }
}
