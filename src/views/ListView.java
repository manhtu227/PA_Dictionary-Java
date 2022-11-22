package views;


import model.Data;
import model.SlangWords;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.List;

import static views.Menu.setColor;

public class ListView extends JPanel {

    public ListView(ActionListener ac,SlangWords sl,String title) {
        setLayout(new BorderLayout());
//        setPreferredSize(new Dimension(1000, 1000));
        JPanel topPanel = new JPanel();
        JLabel name = new JLabel(title, JLabel.CENTER);
        name.setFont(new Font("Verdana", Font.PLAIN, 18));
        JLabel totalList = new JLabel("", JLabel.CENTER);
        JPanel totalList1 = new JPanel();
        totalList1.setLayout(new FlowLayout());
        totalList1.add(totalList);
        JPanel name1 = new JPanel();
        name1.setLayout(new FlowLayout());
        name1.add(name);
        name.setOpaque(true);
        name.setForeground(Color.blue);
        name.setBackground(Color.yellow);
        topPanel.add(name1);
        topPanel.add(totalList1);
//        topPanel.setBorder(new EmptyBorder(new Insets(0, 200, 0, 200)));
        BoxLayout boxLayout = new BoxLayout(topPanel, BoxLayout.Y_AXIS);
        topPanel.setLayout(boxLayout);
//        topPanel.setLayout(new FlowLayout());
        add(topPanel, BorderLayout.PAGE_START);



        JPanel container = new JPanel();
        String[] columnNames = {"slang", "Meaning"};

        String[][] data = {{"", ""}};
        DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(tableModel) {
            private static final long serialVersionUID = 1L;

            public boolean isCellEditable(int row, int column) {
                return false;
            }

            ;
        };
        tableModel.removeRow(0);
        for (HashMap.Entry<String, List<String>> value1 : sl.getDistionary().entrySet()){
            String[] data1 = {value1.getKey(), String.join(", ", value1.getValue())};
            tableModel.insertRow(table.getRowCount(), data1);
        }
        totalList.setText("Total "+table.getRowCount()+" word");
        System.out.println(table.getRowCount());
//        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        JScrollPane scrollPane = new JScrollPane(table);
        table.setFillsViewportHeight(true);
//        container.add(scrollPane);
//        table.

        TableColumn column = null;
        column = table.getColumnModel().getColumn(0);
        column.setPreferredWidth(300);
        column = table.getColumnModel().getColumn(1);
        column.setPreferredWidth(200);


        add(scrollPane, BorderLayout.CENTER);
        Menu mn = null;


        JButton back = new JButton("Menu");
        back.addActionListener(ac);
        setColor(back);
        JPanel bottompanel = new JPanel();
        bottompanel.setLayout(new FlowLayout());
        bottompanel.add(back);
        JPanel bottompanel2 = new JPanel();
        bottompanel2.setLayout(new BoxLayout(bottompanel2, BoxLayout.PAGE_AXIS));
        bottompanel2.add(Box.createRigidArea(new Dimension(0, 5)));
        bottompanel2.add(bottompanel);
        add(bottompanel2, BorderLayout.PAGE_END);
    }

}
