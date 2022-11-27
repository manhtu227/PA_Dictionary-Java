package controller;

import views.Jframe;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameListener implements ActionListener {
    private Jframe jframe;
    private JLabel ques;
    private String check;

    public GameListener(Jframe jframe, JLabel key, String check) {
        this.jframe = jframe;
        this.ques = key;
        this.check = check;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (check.equals("Slang")) {
            JFrame jf = new JFrame();
            if (jframe.getSl().checkValue(ques.getText(), e.getActionCommand()) == true) {
                JOptionPane.showMessageDialog(jf,
                        "Correct answer",
                        "SUCCESS",
                        JOptionPane.INFORMATION_MESSAGE);
                jframe.chuyenMenu();
            } else {
                JOptionPane.showMessageDialog(jf,
                        "Wrong answer",
                        "SUCCESS",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JFrame jf = new JFrame();
            if (jframe.getSl().checkValue(e.getActionCommand(), ques.getText()) == true) {
                JOptionPane.showMessageDialog(jf,
                        "Correct answer",
                        "SUCCESS",
                        JOptionPane.INFORMATION_MESSAGE);
                jframe.chuyenMenu();

            } else {
                JOptionPane.showMessageDialog(jf,
                        "Wrong answer",
                        "SUCCESS",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }
}
