package controller;

import views.Jframe;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class MenuListener implements ActionListener {
    private Jframe mn;
    private JTextField Slang;
    private JTextField Meaning;
    private String key;
    private List<String> values;

    public MenuListener(Jframe mn, String key, List<String> values) {
        this.mn = mn;
        this.key = key;
        this.values = values;

    }

    public MenuListener(Jframe mn, JTextField Slang, JTextField Meaning) {
        this.mn = mn;
        this.Slang = Slang;
        this.Meaning = Meaning;
    }

    public MenuListener(Jframe mn) {
        this.mn = mn;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
        if (e.getActionCommand().toString().compareTo("Update") == 0) {
            mn.getSl().editSlang(Slang.getText(), Meaning.getText());
            JFrame jf = new JFrame();
            JOptionPane.showMessageDialog(jf,
                    "Update success",
                    "SUCCESS",
                    JOptionPane.INFORMATION_MESSAGE);
            this.mn.chuyenMenu();

        }
        if (e.getActionCommand().toString().compareTo("Delete") == 0) {
            mn.getSl().deleteSlang(Slang.getText());
            JFrame jf = new JFrame();
            JOptionPane.showMessageDialog(jf,
                    "Delete success",
                    "SUCCESS",
                    JOptionPane.INFORMATION_MESSAGE);
            this.mn.chuyenMenu();

        }

        if (e.getActionCommand().toString().compareTo("Show List Slang Word") == 0) {
            this.mn.chuyen();
        }
        if (e.getActionCommand().toString().compareTo("Menu") == 0) {
            this.mn.chuyenMenu();
        }
        if (e.getActionCommand().toString().compareTo("Search Slang") == 0) {
            this.mn.chuyenSearchSlang();
        }
        if (e.getActionCommand().toString().compareTo("Search Dectination") == 0) {
            this.mn.chuyenSearchKey();
        }
        if (e.getActionCommand().toString().compareTo("Add Slang Word") == 0) {
            this.mn.chuyenAdd();
        }
        if (e.getActionCommand().toString().compareTo("Add") == 0) {
            this.mn.addSlang(Slang, Meaning);
        }
        if (e.getActionCommand().toString().compareTo("History") == 0) {
            this.mn.chuyenHistory();
        }
        if (e.getActionCommand().toString().compareTo("Random") == 0) {
            this.mn.chuyenRandom();
        }

        if (e.getActionCommand().toString().compareTo("random") == 0) {
            String key = mn.getSl().randomSlangWord();
            String mean = String.join(",",mn.getSl().getDistionary().get(key));
            Slang.setText(key);
            Meaning.setText(mean);
        }
        if (e.getActionCommand().toString().compareTo("Update And Delete") == 0) {
            this.mn.chuyenUpdateAndDelete();
        }
        if (e.getActionCommand().toString().compareTo("Duplicate") == 0) {
            System.out.println((key));
            this.mn.getSl().getDistionary().get(key).add(String.join(", ", values));
            JFrame jf = new JFrame();
            JOptionPane.showMessageDialog(jf,
                    "Duplicate success",
                    "ERROR",
                    JOptionPane.INFORMATION_MESSAGE);
            this.mn.chuyenMenu();
        }
        if (e.getActionCommand().toString().compareTo("Overviews") == 0) {
            this.mn.getSl().getDistionary().replace(key, values);
            JFrame jf = new JFrame();
            JOptionPane.showMessageDialog(jf,
                    "Overviews success",
                    "ERROR",
                    JOptionPane.INFORMATION_MESSAGE);
            this.mn.chuyenMenu();

        }

    }
}
