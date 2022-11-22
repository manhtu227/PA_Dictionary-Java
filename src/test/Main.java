package test;

import model.*;
import views.Menu;
import views.jframe;

import java.io.IOException;


public class Main {
//    public static void main(String[] args) throws IOException {
//        SlangWords dic = new SlangWords();
//        Data heloo= new Data();
//        heloo.readFile("slang.txt",dic);
//        Search f = new Search();
//        f.getValueFromKey("Slag",dic);
////        heloo.toString();
//        System.out.println("Hello world!");
//    }

    public static void main(String[] args) {
        jframe mn=new jframe();
        Data file = new Data();
        file.readFile("Slang.txt",mn.getSl());
        Menu m=new Menu(mn.ac);
        m.setOpaque((true));
        mn.getFrame().setContentPane(m);
        mn.getFrame().pack();
        mn.getFrame().setVisible(true);
        System.out.println("hello");
    }


}
