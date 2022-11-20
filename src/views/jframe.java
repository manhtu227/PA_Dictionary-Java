package views;

import controller.MenuListener;
import model.SlangWords;

import javax.swing.*;
import java.awt.event.ActionListener;

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
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



    public void chuyenSearchSlang()
    {
        String[][] data ={{"",""}};
        SearchSlangView search=new SearchSlangView(data,this,0);
        search.setOpaque((true));
        frame.setContentPane(search);
        frame.pack();
        frame.setVisible(true);
    }
    public void chuyenSearchKey()
    {
        String[][] data ={{"",""}};
        SearchSlangView search=new SearchSlangView(data,this,1);
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
    public void chuyen() {
        ListView newContentPane = new ListView(this.ac);
        newContentPane.setOpaque((true));
        frame.setContentPane(newContentPane);
        frame.pack();
        frame.setVisible(true);
    }
}
