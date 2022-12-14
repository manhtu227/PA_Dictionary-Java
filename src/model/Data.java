package model;

import model.SlangWords;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Data {
    public void readFile(String path, SlangWords file) {
        FileReader fr = null;
        BufferedReader Br = null;
        List<String> value = new ArrayList<>();
        String key;
        String[] distionary = new String[1];
        try {
            fr = new FileReader(path);
            Br = new BufferedReader(fr);
            String line = Br.readLine();
            while (line != null) {
                if (line.contains("`")) {
                    value.removeAll(value);
                    distionary = line.split("`");
                    if (distionary.length != 0) {
                        String[] name = distionary[1].split("\\| ");
                        for (int i = 0; i < name.length; i++) {
                            value.add(name[i]);
                        }
                        List<String> List = new ArrayList<String>(value);
                        file.getDistionary().put(distionary[0], List);
                    }
                } else {
                    value.add((line));
                    List<String> List = new ArrayList<String>(value);
                    file.getDistionary().replace(distionary[0], List);
                }
                line = Br.readLine();

            }
            Br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void exportData(String path, String key,List<String> values) throws IOException {
        try {
            File file = new File(path);
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            String value =String.join("| ",values);
            bw.newLine();
            bw.write(key+"`"+value);
            bw.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public List<String> readFileHistory(String path){
        FileReader fr = null;
        BufferedReader Br = null;
        List<String> history = new ArrayList<>();
        try {
            fr = new FileReader(path);
            Br = new BufferedReader(fr);
            String line = Br.readLine();
            String[] list = line.split(",");
            for(String i:list){
                history.add(i);
            }
            return history;
        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}