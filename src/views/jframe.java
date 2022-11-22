package views;

import controller.MenuListener;
import model.Data;
import model.SlangWords;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;

public class jframe {
    private JFrame frame;
    public ActionListener ac;

    private SlangWords sl;

    public SlangWords getSl() {
        return sl;
    }

    public void setSl(SlangWords sl) {
        this.sl = sl;
    }

    public JFrame getFrame() {
        return frame;
    }

    public ActionListener getAc() {
        return ac;
    }

    public jframe() {
        this.sl = new SlangWords();
        this.ac = new MenuListener(this);
        JFrame.setDefaultLookAndFeelDecorated((true));
        this.frame = new JFrame("Slang Words");
        this.frame.setLocation(400,150);
//        this.frame.setSize(600,500);
//        frame.setLocationRelativeTo(c);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                if (JOptionPane.showConfirmDialog(frame,
                        "Are you sure you want to close this window?", "Close Window?",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
                    Data Slang =new Data();
                    PrintWriter writer = null;
                    try {
                        writer = new PrintWriter("slang.txt");
                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }
                    writer.print("");
                    writer.close();
                    for (HashMap.Entry<String, List<String>> value1 : sl.getDistionary().entrySet()){
                        try {

                            Slang.exportData("slang.txt",value1.getKey(),value1.getValue());
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }

                    }
                    System.exit(0);
                }
            }
        });
    }



    public void chuyenSearchSlang()
    {
        String[][] data ={{"",""}};
        SearchSlangView search=new SearchSlangView(data,this,"Search Slang");
        search.setOpaque((true));
        frame.setContentPane(search);
        frame.pack();
        frame.setVisible(true);
    }
    public void chuyenSelect(String key, List<String> Meaning){
        selectView mn=new selectView(this,key,Meaning);
        mn.setOpaque((true));
        frame.setContentPane(mn);
        frame.pack();
        frame.setVisible(true);
    }
    public void chuyenSearchKey()
    {
        String[][] data ={{"",""}};
        SearchSlangView search=new SearchSlangView(data,this,"Search Definition");
        search.setOpaque((true));
        frame.setContentPane(search);
        frame.pack();
        frame.setVisible(true);
    }
    public void chuyenMenu() {
        Menu mn=new Menu(this.ac);
        mn.setOpaque((true));
        frame.setContentPane(mn);
        frame.pack();
        frame.setVisible(true);
    }
    public void chuyenAdd() {
        AddView mn=new AddView(this);
        mn.setOpaque((true));
        frame.setContentPane(mn);
        frame.pack();
        frame.setVisible(true);
    }
    public  void chuyen(){
        ListView newContentPane = new ListView(this.ac,sl,"List Slang Word");
        newContentPane.setOpaque((true));
        frame.setContentPane(newContentPane);
        frame.pack();
        frame.setVisible(true);
    }

    public void chuyenHistory() {
        SlangWords sl = new SlangWords();
        Data readHistory = new Data();
        readHistory.readFile("history.txt", sl);
        ListView newContentPane = new ListView(this.ac,sl,"History");
        newContentPane.setOpaque((true));
        frame.setContentPane(newContentPane);
        frame.pack();
        frame.setVisible(true);
    }
    public void addSlang(JTextField Slang, JTextField Meaning){
        System.out.println(Slang.getText());
        sl.addSlangWord(Slang.getText().toString(),Meaning.getText().toString(),this);
    }
}
