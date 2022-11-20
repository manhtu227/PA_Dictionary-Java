package views;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableColumn;
import java.awt.*;

public class ListView extends JPanel {
    public ListView() {
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
        Object[][] data = {
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
                {"kathy", "hello"},
        };

        JTable table = new JTable(data, columnNames) {
            private static final long serialVersionUID = 1L;

            public boolean isCellEditable(int row, int column) {
                return false;
            };
        };
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

    }

    public static void createAndShowGUI() {
        JFrame.setDefaultLookAndFeelDecorated((true));
        JFrame frame = new JFrame(("Show list"));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ListView newContentPane = new ListView();
        newContentPane.setOpaque((true));
        frame.setContentPane(newContentPane);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        createAndShowGUI();
    }
}
