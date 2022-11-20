package controller;

import model.SlangWords;
import views.Menu;
import views.jframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuListener implements ActionListener {
    private jframe mn;
    public MenuListener(jframe mn){
        this.mn = mn;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
        if(e.getActionCommand().toString().compareTo("Show List Slang Word")==0){
            this.mn.chuyen();
        }
        if(e.getActionCommand().toString().compareTo("Back")==0){
            this.mn.chuyenMenu();
        }
        if(e.getActionCommand().toString().compareTo("Search Slang")==0){
            this.mn.chuyenSearchSlang();
        }
        if(e.getActionCommand().toString().compareTo("Search Dectination")==0){
            this.mn.chuyenSearchKey();
        }


    }
}
