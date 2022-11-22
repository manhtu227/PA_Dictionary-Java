package controller;

import model.Search;
import views.jframe;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.List;

public class SearchListener implements KeyListener {
    private JTextField text;
    private jframe mn;
    private String search;
    private DefaultTableModel tableModel;

    public SearchListener(JTextField text, jframe mn, String search, DefaultTableModel table) {
        this.mn = mn;
        this.text = text;
        this.search = search;
        this.tableModel = table;
    }

    public JTextField getText() {
        return text;
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        try {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                if (tableModel.getRowCount() > 0) {
                    for (int i = tableModel.getRowCount() - 1; i > -1; i--){
                        tableModel.removeRow(i);
                    }
                }
                String d = text.getText();
                if (search.compareTo("Search Slang")==0) {
                    Search s = new Search();
                    String value = s.getValueFromKey(d, mn.getSl());
                    if (value != null) {
                        String[] data = {d, value};
                        tableModel.insertRow(0, data);
//                        table.addColumn(data);

                    }
                } else {
                    Search s = new Search();
                    List<String> key = s.getKeyFromValue(d, mn.getSl());
                    for(String i:key){
                        String value = String.join(", ",mn.getSl().getDistionary().get(i));;
                        if (key != null) {
                            String[] data = {i, value};
                            tableModel.insertRow(0, data);
                        }
                    }


                }
            }

        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
