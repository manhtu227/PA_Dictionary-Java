package controller;

import views.jframe;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class MenuListener implements ActionListener {
    private jframe mn;
    private JTextField Slang;
    private JTextField Meaning;
    private String key;
    private List<String> values;
    public MenuListener(jframe mn,String key, List<String> values){
        this.mn=mn;
        this.key=key;
        this.values=values;
    }
    public MenuListener(jframe mn, JTextField Slang, JTextField Meaning) {
        this.mn = mn;
        this.Slang = Slang;
        this.Meaning = Meaning;
    }

    public MenuListener(jframe mn) {
        this.mn = mn;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
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
            this.mn.addSlang( Slang,  Meaning);
        }
        if (e.getActionCommand().toString().compareTo("History") == 0) {
            this.mn.chuyenHistory();
        }
        if (e.getActionCommand().toString().compareTo("Duplicate") == 0) {
            System.out.println((key));
            this.mn.getSl().getDistionary().get(key).add(String.join(", ",values));
            JFrame jf =new JFrame();
            JOptionPane.showMessageDialog(jf,
                    "Duplicate success",
                    "ERROR",
                    JOptionPane.INFORMATION_MESSAGE);
            this.mn.chuyenMenu();
        }
        if (e.getActionCommand().toString().compareTo("Overviews") == 0) {
            this.mn.getSl().getDistionary().replace(key, values);
            JFrame jf =new JFrame();
            JOptionPane.showMessageDialog(jf,
                    "Overviews success",
                    "ERROR",
                    JOptionPane.INFORMATION_MESSAGE);
            this.mn.chuyenMenu();

        }

    }
}
