package model;


import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Search {
    public String getValueFromKey(String key, SlangWords dictionary) throws IOException {
        Data writeHistory = new Data();

        if (dictionary.getDistionary().containsKey(key)) {
            writeHistory.exportData("history.txt", key,dictionary.getDistionary().get(key));
            String delim = ", ";
            String value = String.join(delim,dictionary.getDistionary().get(key));
            return value;
        }
        return null;
    }

    public List<String> getKeyFromValue(String value, SlangWords dictionary) throws IOException {
        Data writeHistory = new Data();
        List<String> key=new ArrayList<>();
        for (HashMap.Entry<String, List<String>> value1 : dictionary.getDistionary().entrySet()){
            for (String check : value1.getValue()){
                if (check.contains(value)) {
                    key.add(value1.getKey());
                    writeHistory.exportData("history.txt", value1.getKey(),dictionary.getDistionary().get(value1.getKey()));

                }
            }
        }
        return key;
    }
}