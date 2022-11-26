package views;

import controller.MenuListener;

import javax.swing.*;
import java.awt.*;

public class randomView extends JPanel{
    private JTextField Slang;
    private JTextField text;
    public randomView(Jframe jframe){
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel server = new JLabel("Slang:        ");
        Slang = new JTextField();
        JPanel serverPanel = setLayout(server, Slang);

        JLabel database = new JLabel("Meaning:  ");
        text = new JTextField();
        JPanel dataPanel = setLayout(database, text);





        JPanel center = new JPanel();
        center.setLayout(new BoxLayout(center, BoxLayout.Y_AXIS));
        add(serverPanel);
        add(dataPanel);
//        add(center, BorderLayout.PAGE_START);
        MenuListener mn= new MenuListener(jframe,Slang,text);
        JButton random = new JButton("random");
        JButton Menu = new JButton("Menu");
        JPanel button = new JPanel();
        button.setLayout(new FlowLayout());
        random.addActionListener(mn);
        Menu.addActionListener(mn);
        button.add(random);
        button.add(Menu);
        add(button);
    }
    public JPanel setLayout(JLabel label, JTextField text) {
        text.setColumns(15);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(label);
        panel.add(text);
        return panel;
    }
}
