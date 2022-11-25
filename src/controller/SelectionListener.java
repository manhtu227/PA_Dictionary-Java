package controller;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class SelectionListener implements MouseListener {
    private JTable table;
    private JTextField keyText;
    private JTextField MeaningText;
    public SelectionListener(JTable t, JTextField keyText,JTextField MeaningText){
        this.table= t;
        this.keyText=keyText;
        this.MeaningText=MeaningText;
    }
//    @Override
//    public void valueChanged(ListSelectionEvent e) {
//        ListSelectionModel lsm = (ListSelectionModel)e.getSource();
////        System.out.println(        lsm.getMinSelectionIndex());
////        System.out.println(lsm.getLeadSelectionIndex());
////        table.getSelectedRow();
//        DefaultTableModel tableModel1 = (DefaultTableModel) table.getModel();
////        System.out.println(table.getSelectedRow());
//        System.out.println(tableModel1.getValueAt(table.getSelectedRow(),1));
//    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println(table.getSelectedRow());
        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
        this.keyText.setText(tableModel.getValueAt(table.getSelectedRow(),0).toString());
        this.MeaningText.setText(tableModel.getValueAt(table.getSelectedRow(),1).toString());

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
