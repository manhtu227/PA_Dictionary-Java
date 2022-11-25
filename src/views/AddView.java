package views;

import controller.MenuListener;

import javax.swing.*;
import java.awt.*;

public class AddView extends JPanel{
    JTextField Slang;
    JTextField Meaning;
    public AddView(Jframe jframe){
        setLayout(new BorderLayout());
        JPanel panel = new JPanel();
        JPanel toppanel = new JPanel();
        JLabel add = new JLabel("Add Slang Word");
        toppanel.setLayout(new FlowLayout());
        toppanel.add(add);

        add(toppanel, BorderLayout.PAGE_START);
        JPanel line1 =new JPanel();
        JLabel slang = new JLabel("SLang word:");
        Slang = new JTextField();
        this.Slang.setColumns(10);
        line1.setLayout(new FlowLayout());
        line1.add(slang);
        line1.add(Slang);


        JPanel line2 =new JPanel();
        JLabel meaning = new JLabel("Meaning:");
        Meaning = new JTextField();
        this.Meaning.setColumns(10);
        line2.setLayout(new FlowLayout());
        line2.add(meaning);
        line2.add(Meaning);

        JPanel center = new JPanel();
        center.setLayout(new GridLayout(2,1));
        center.add(line1);
        center.add(line2);

        add(center,BorderLayout.CENTER);
        MenuListener ac = new MenuListener(jframe,Slang,Meaning);
        JPanel bottompannel = new JPanel();
        bottompannel.setLayout(new BoxLayout(bottompannel,BoxLayout.LINE_AXIS));
        JButton add1 = new JButton("Add");
        JButton Menu = new JButton("Menu");
        add1.addActionListener(ac);
        bottompannel.add(add1);
        bottompannel.add(Box.createRigidArea(new Dimension(20,0)));
        bottompannel.add(Menu);
        Menu.addActionListener(ac);

        JPanel bottompanel2=new JPanel();
        bottompanel2.setLayout(new BoxLayout(bottompanel2,BoxLayout.PAGE_AXIS));
        bottompanel2.add(Box.createRigidArea(new Dimension(0,5)));
        bottompanel2.add(bottompannel);


        bottompannel.setBorder(BorderFactory.createLineBorder(Color.PINK));

        add(bottompanel2,BorderLayout.PAGE_END);
    }
}
