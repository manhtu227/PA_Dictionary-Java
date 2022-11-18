import java.io.*;
import java.util.ArrayList;

public class Data {
    public void readFile(String path, SlangWords file) {
        FileReader fr = null;
        BufferedReader Br = null;
        ArrayList<String> value = new ArrayList<>();
        String key;
        String[] distionary = new String[1];
        try {
            fr = new FileReader(path);
            Br = new BufferedReader(fr);
            String line = Br.readLine();
            long x = 0;
            while (line != null) {
                x++;
                if (line.contains("`")) {
                    value.removeAll(value);
                    System.out.println(file.distionary.get(distionary[0]));
                    distionary = line.split("`");
                    if (distionary.length != 0) {
                        String[] name = distionary[1].split("\\| ");
                        for (int i = 0; i < name.length; i++) {
                            value.add(name[i]);
                        }
                        ArrayList<String> List = new ArrayList<String>(value);
                        file.distionary.put(distionary[0], List);
                    } else {
                        System.out.println("hello");
                    }
                } else {
                    value.add((line));
                    ArrayList<String> List = new ArrayList<String>(value);
                    file.distionary.replace(distionary[0], List);
                }
                line = Br.readLine();

                System.out.println(x);

            }
            Br.close();
            fr.close();
            System.out.println("----importData successfully----");
        } catch (Exception e) {
            System.out.println("hellp");
            e.printStackTrace();
        }
    }
    public void exportData(String path, String key) throws IOException {
        try {
            File file = new File(path);
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(key+",");
            bw.close();
            fw.close();
            System.out.println("----exportData successfully----");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}