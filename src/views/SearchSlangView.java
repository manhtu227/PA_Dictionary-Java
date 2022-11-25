package views;

import controller.SearchListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.awt.*;

import static views.Menu.setColor;


public class SearchSlangView extends JPanel {
    JTextField ques;
    DefaultTableModel tableModel;
    public SearchSlangView(String[][] data, Jframe jframe, String search) {
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(400, 400));
        setLocation(200,200);
//        setLocation(null);
        JPanel topPanel = new JPanel();
        JLabel name = new JLabel(search);

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
        SearchListener sL = new SearchListener(ques,jframe,search,tableModel);
        ques.addKeyListener(sL);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        JScrollPane scrollPane = new JScrollPane(table);
        table.setFillsViewportHeight(true);
//        container.add(scrollPane);
//        table.

        TableColumn column = null;
        column = table.getColumnModel().getColumn(0);
        column.setPreferredWidth(200);
        column = table.getColumnModel().getColumn(1);
        column.setPreferredWidth(200);


        add(scrollPane,BorderLayout.CENTER);
        Menu mn = null;
//        ActionListener ac = new MenuListener(mn);

//        JButton back = new JButton();
        JButton jb3 = new JButton("Back");



        JButton back = new JButton("Menu");
        back.addActionListener(jframe.getAc());
        setColor(back);
        JPanel bottompanel = new JPanel();
        bottompanel.setLayout(new FlowLayout());
        bottompanel.add(back);
        JPanel bottompanel2=new JPanel();
        bottompanel2.setLayout(new BoxLayout(bottompanel2,BoxLayout.PAGE_AXIS));
        bottompanel2.add(Box.createRigidArea(new Dimension(0,5)));
        bottompanel2.add(bottompanel);
        add(bottompanel2,BorderLayout.PAGE_END);
    }


}