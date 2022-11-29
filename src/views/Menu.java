package views;

import controller.MenuListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;

public class Menu extends JPanel {

    public Menu(ActionListener ac) {
        JPanel center =new JPanel();
        center.setLayout(new FlowLayout());
        JPanel panel = new JPanel();
        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        panel.setLayout(new GridLayout(11, 1));
        // Tạo Border cho panel
        panel.setBorder(new EmptyBorder(new Insets(0, 200, 0, 0)));
//        ActionListener ac = new MenuListener(this);
        // Tạo các Button
        JLabel name = new JLabel("MENU",JLabel.CENTER);
        name.setFont(new Font("Verdana", Font.PLAIN, 18));

        JButton jb1 = new JButton("Show List Slang Word");
        setColor(jb1);
        JButton jb2 = new JButton("Search Slang");
        setColor(jb2);
        JButton jb3 = new JButton("Search Definition");
        setColor(jb3);
        JButton jb4 = new JButton("Add Slang Word");
        setColor(jb4);
        JButton jb5 = new JButton("History");
        setColor(jb5);
        JButton jb10 = new JButton("Reset");
        setColor(jb10);
        JButton jb6 = new JButton("Update And Delete");
        setColor(jb6);
        JButton jb7 = new JButton("Random");
        setColor(jb7);
        JButton jb8 = new JButton("PlayGame Random SlangWord");
        setColor(jb8);
        JButton jb9 = new JButton("PlayGame Random Definition");
        setColor(jb9);

        jb1.addActionListener(ac);
        jb2.addActionListener(ac);
        jb3.addActionListener(ac);
        jb4.addActionListener(ac);
        jb5.addActionListener(ac);
        jb10.addActionListener(ac);
        jb6.addActionListener(ac);
        jb7.addActionListener(ac);
        jb8.addActionListener(ac);
        jb9.addActionListener(ac);
        // Thêm Button vào Panel
        panel.add(name);
        panel.add(Box.createRigidArea(new Dimension(0, 50)));
        panel.add(jb1);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));
        panel.add(jb2);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(jb3);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(jb4);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(jb5);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(jb10);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(jb6);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(jb7);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(jb8);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(jb9);
        center.add(panel);
        add(center);
    }

    public static void setColor(JButton b) {
        b.setOpaque(true);
        b.setBackground(new Color(59, 89, 182));
        b.setForeground(Color.WHITE);
        b.setFocusPainted(false);
        b.setFont(new Font("Tahoma", Font.BOLD, 12));
//        b.setPreferredSize(new Dimension(400, 40));
    }
//    public void chuyen(){
//        ListView newContentPane = new ListView();
////        ListView list =new ListView();
//            newContentPane.setOpaque((true));
//            frame.setContentPane(newContentPane);
//        ListView ls =new ListView();
//        this.frame.setContentPane(ls);
//    }
//    public static void createAndShowGUI(String name) {
//        JFrame.setDefaultLookAndFeelDecorated((true));
//        JFrame frame = new JFrame(name);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
////
////        list.setOpaque((true));
////        frame.setContentPane(list);
//        frame.pack();
//        frame.setVisible(true);
//
//    }

}
