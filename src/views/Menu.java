package views;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableColumn;
import java.awt.*;

public class Menu extends JPanel {
    public static void setColor(JButton b){
        b.setOpaque(true);
        b.setBackground(new Color(59, 89, 182));
        b.setForeground(Color.WHITE);
        b.setFocusPainted(false);
        b.setFont(new Font("Tahoma", Font.BOLD, 12));
//        b.setPreferredSize(new Dimension(400, 40));
    }
    public Menu() {
        JPanel panel  = new JPanel();
        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        panel.setLayout(new GridLayout(8,1));
        // Tạo Border cho panel
        panel.setBorder(new EmptyBorder(new Insets(0, 100, 0, 0)));
        // Tạo các Button
        JLabel name = new JLabel("MENU");
        JButton jb1 = new JButton("Show List Slang Word");
        setColor(jb1);
        JButton jb2 = new JButton("Search Slang");
        setColor(jb2);
        JButton jb3 = new JButton("Search Dectination");
        setColor(jb3);
        JButton jb4 = new JButton("Delete");
        setColor(jb4);
        JButton jb5 = new JButton("Reset");
        setColor(jb5);
        JButton jb6 = new JButton("game");
        setColor(jb6);
        JButton jb7 = new JButton("Button 7");
        setColor(jb7);
        // Thêm Button vào Panel
        panel.add(name);
        panel.add(Box.createRigidArea(new Dimension(0,10)));

        panel.add(jb1);
        panel.add(Box.createRigidArea(new Dimension(0,10)));
        panel.add(jb2);
        panel.add(Box.createRigidArea(new Dimension(0,10)));
        panel.add(jb3);
        panel.add(Box.createRigidArea(new Dimension(0,10)));
        panel.add(jb4);
        panel.add(Box.createRigidArea(new Dimension(0,10)));
        panel.add(jb5);
        panel.add(Box.createRigidArea(new Dimension(0,10)));
        panel.add(jb6);
        panel.add(Box.createRigidArea(new Dimension(0,10)));
        panel.add(jb7);
        add(panel);
    }

    public static void createAndShowGUI() {
        JFrame.setDefaultLookAndFeelDecorated((true));
        JFrame frame = new JFrame(("Show list"));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Menu newContentPane = new Menu();
        newContentPane.setOpaque((true));
        frame.setContentPane(newContentPane);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        createAndShowGUI();
    }
}
