package views;

import controller.SearchListener;
import model.SlangWords;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.awt.event.ActionListener;

import static views.Menu.setColor;


public class SearchSlangView extends JPanel {
    JTextField ques;
    DefaultTableModel tableModel;
    public SearchSlangView(String[][] data,jframe jframe,int check) {
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(500, 250));
        JPanel topPanel = new JPanel();
        JLabel name = new JLabel("Search Slang:");

        this.ques = new JTextField();
        this.ques.setColumns(10);

        name.setOpaque(true);
        name.setForeground(Color.blue);
        name.setBackground(Color.yellow);
        topPanel.add(name);
        topPanel.add(this.ques);
//        topPanel.setBorder(new EmptyBorder(new Insets(0, 200, 0, 200)));
//        BoxLayout boxLayout = new BoxLayout(topPanel, BoxLayout.Y_AXIS);
        topPanel.setLayout(new FlowLayout());
//        topPanel.setLayout(new FlowLayout());

        add(topPanel,BorderLayout.PAGE_START);


        JPanel container = new JPanel();
        String[] columnNames = {"slang", "Meaning"};
//        String[][] data = {
//                {"", ""}
//        };
        tableModel = new DefaultTableModel(data,columnNames);
        JTable table = new JTable(tableModel) {
            private static final long serialVersionUID = 1L;
            public boolean isCellEditable(int row, int column) {
                return false;
            };
        };
        SearchListener sL = new SearchListener(ques,jframe,check,tableModel);
        ques.addKeyListener(sL);
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

//        JButton back = new JButton();
        JButton jb3 = new JButton("Back");

        jb3.addActionListener(jframe.getAc());
        setColor(jb3);
        add(jb3,BorderLayout.PAGE_END);
    }


}