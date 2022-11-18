import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Search {
    public void getValueFromKey(String key, SlangWords dictionary) throws IOException {
        Data writeHistory = new Data();
        writeHistory.exportData("history.txt", key);
        if (dictionary.getDistionary().containsKey(key)) {
            String meaning = dictionary.getDistionary().get(key).get(0);
            System.out.println(key + " " + meaning);
        }
    }

    public void getKeyFromValue(String value, SlangWords dictionary) throws IOException {
        Data writeHistory = new Data();
        writeHistory.exportData("history.txt", value);
        for (HashMap.Entry<String, ArrayList<String>> value1 : dictionary.getDistionary().entrySet()) {
            if (value1.getValue().contains(value)) {
                System.out.println(value1.getKey());
            }
        }
    }
}