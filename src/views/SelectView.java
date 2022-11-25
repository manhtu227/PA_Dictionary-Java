package views;

import controller.MenuListener;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class SelectView extends JPanel {
    public SelectView(Jframe jframe, String key, List<String> Values){
        JPanel bottompannel = new JPanel();
        MenuListener ac = new MenuListener(jframe,key,Values);
        bottompannel.setLayout(new BoxLayout(bottompannel,BoxLayout.LINE_AXIS));
        JButton add1 = new JButton("Duplicate");
        JButton Menu = new JButton("Overviews");
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
