package views;


import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import static views.Menu.setColor;

public class ListView extends JPanel {
    public ListView(ActionListener ac) {
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(500, 250));
        JPanel topPanel = new JPanel();
        JLabel name = new JLabel("Slang Word List");
        JLabel totalList = new JLabel("Total 7762 word");
        name.setOpaque(true);
        name.setForeground(Color.blue);
        name.setBackground(Color.red);
        topPanel.add(name);
        topPanel.add(totalList);
        topPanel.setBorder(new EmptyBorder(new Insets(0, 200, 0, 200)));
        BoxLayout boxLayout = new BoxLayout(topPanel, BoxLayout.Y_AXIS);
        topPanel.setLayout(boxLayout);
//        topPanel.setLayout(new FlowLayout());
        add(topPanel,BorderLayout.PAGE_START);


        JPanel container = new JPanel();
        String[] columnNames = {"slang", "Meaning"};
//        List<List<String>> data = new ArrayList<>();
//        List<String> me =new ArrayList<>();
//        name.add("hello");
//        name.add("hello");
//        data.add(me);
        String[][] data = {
                {"kathy", "hello"},
                {"kathy", "hello"},
                {"kathy", "hello"},
                {"kathy", "hello"},
                {"kathy", "hello"},
                {"kathy", "hello"},
                {"kathy", "hello"},
                {"kathy", "hello"},
                {"kathy", "hello"},
                {"kathy", "hello"},
                {"kathy", "hello"},
                {"kathy", "hello"},
                {"kathy", "hello"},
                {"kathy", "hello"},
                {"kathy", "hello"},
                {"kathy", "hello"},
                {"kathy", "hello"},
                {"kathy", "hello"},
                {"kathy", "hello","hello"},
        };
        DefaultTableModel tableModel = new DefaultTableModel(data,columnNames);
        JTable table = new JTable(tableModel) {
            private static final long serialVersionUID = 1L;
            public boolean isCellEditable(int row, int column) {
                return false;
            };
        };
        tableModel.insertRow(0,columnNames);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        JScrollPane scrollPane = new JScrollPane(table);
        table.setFillsViewportHeight(true);
//        container.add(scrollPane);
//        table.

        TableColumn column = null;
        column = table.getColumnModel().getColumn(0);
        column.setPreferredWidth(300);
        column = table.getColumnModel().getColumn(1);
        column.setPreferredWidth(200);


        add(scrollPane,BorderLayout.CENTER);
        Menu mn = null;
//        ActionListener ac = new MenuListener(mn);

        JButton back = new JButton();
        JButton jb3 = new JButton("Back");

        jb3.addActionListener(ac);
        setColor(jb3);
        add(jb3,BorderLayout.PAGE_END);
    }


}
