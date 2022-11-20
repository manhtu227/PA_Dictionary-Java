package model;


import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Search {
    public String getValueFromKey(String key, SlangWords dictionary) throws IOException {
        Data writeHistory = new Data();
        writeHistory.exportData("history.txt", key);
        if (dictionary.getDistionary().containsKey(key)) {
            String delim = ", ";
            String value = String.join(delim,dictionary.getDistionary().get(key));
            return value;
        }
        return null;
    }

    public List<String> getKeyFromValue(String value, SlangWords dictionary) throws IOException {
        Data writeHistory = new Data();
        writeHistory.exportData("history.txt", value);
        List<String> key=new ArrayList<>();
        for (HashMap.Entry<String, List<String>> value1 : dictionary.getDistionary().entrySet()){
            for (String check : value1.getValue()){
                if (check.contains(value)) {
                    key.add(value1.getKey());
                }
            }
        }
        return key;
    }
}