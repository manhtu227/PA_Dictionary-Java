package views;

import controller.GameListener;

import javax.swing.*;
import java.awt.*;

public class PlaygameView extends JPanel {
    private JTextField Slang;
    private JTextField text;
    public PlaygameView(Jframe jframe, String key, String[] answer, String check){
        setLayout(new BorderLayout());
        JPanel label = new JPanel();
        label.setLayout(new FlowLayout());
        JLabel ques = new JLabel(key);
        label.add(ques);
        ques.setFont(new Font("Verdana", Font.PLAIN, 40));
        add(label,BorderLayout.PAGE_START);
//        add(center, BorderLayout.PAGE_START);
        JButton answer1 = new JButton(answer[0]);
        JButton answer2 = new JButton(answer[1]);
        answer1.setFont(new Font("Arial", Font.PLAIN, 20));
        answer2.setFont(new Font("Arial", Font.PLAIN, 20));

        JButton answer3 = new JButton(answer[2]);
        JButton answer4 = new JButton(answer[3]);
        answer3.setFont(new Font("Arial", Font.PLAIN, 20));
        answer4.setFont(new Font("Arial", Font.PLAIN, 20));
        JPanel answerButon = new JPanel();
        answerButon.setLayout(new GridLayout(2,2));
        answerButon.add(answer1);
        answerButon.add(answer2);
        answerButon.add(answer3);
        answerButon.add(answer4);
        GameListener game = new GameListener(jframe,ques,check);
        answer1.addActionListener(game);
        answer2.addActionListener(game);
        answer3.addActionListener(game);
        answer4.addActionListener(game);
        add(answerButon,BorderLayout.CENTER);
        JButton menu = new JButton("Menu");
        menu.addActionListener(jframe.ac);
        JPanel menu1 = new JPanel();
        label.setLayout(new FlowLayout());
        menu1.add(menu);
        add(menu1,BorderLayout.PAGE_END);
    }
}
