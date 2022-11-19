import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

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
//        for(String key: dictionary.getDistionary().keySet())
//        {
//            if(dictionary.getDistionary().get(key).contains(value)){
//                System.out.println(key);
//            }
//        }
        for (HashMap.Entry<String, ArrayList<String>> value1 : dictionary.getDistionary().entrySet()){
            for (String check : value1.getValue()){
                if (check.contains(value)) {
                    System.out.println(value1.getKey());
                }
            }
        }
    }


}