package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class SlangWords {

    HashMap<String, List<String>> distionary;
    List<String> AddSlangWordList;

    public SlangWords() {
        this.distionary = new HashMap<String, List<String>>();
        this.AddSlangWordList = new ArrayList<>();
    }

    public HashMap<String, List<String>> getDistionary() {
        return distionary;
    }

    public void setDistionary(HashMap<String, List<String>> distionary) {
        this.distionary = distionary;
    }

    public void addSlangWord(String key, String Meaning) {
        String[] values;
        List<String> listValues = new ArrayList<>();
        if (Meaning.contains(",")) {
            values = Meaning.split(",");
            for (String i : values){
                listValues.add(i);
            }
        } else {
            listValues.add(Meaning);
        }
        if (this.distionary.containsKey(key)) {
            if (this.distionary.get(key).contains(Meaning)) {
                System.out.println("1.overwrite");
                System.out.println("2.duplicate");
                int choose = 1;
                if (choose == 1) {
                    this.distionary.replace(key, listValues);
                } else {
                    this.distionary.get(key).add(Meaning);
                }
            }
        } else {
            this.distionary.put(key, listValues);
            this.AddSlangWordList.add(key);
        }
    }

    public void deleteSlang(String key) {
        if (distionary.containsKey(key) == true) {
            distionary.remove(key);
        }
    }

    public void editSlang(String key, String Meaning) {
        if (distionary.containsKey(key)) {
            List<String> means = new ArrayList<String>();
            String[] listValue = Meaning.split(",");
            for (String i : listValue){
                means.add(i);
            }
            distionary.replace(key, means);
        }
    }

    public void resetSlangWords() {
        for (String i : this.AddSlangWordList){
            if (this.distionary.containsKey(i)) {
                this.distionary.remove(i);
            }
        }
    }

    public String randomSlangWord() {
        Random rn = new Random();

        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = rn.nextInt((distionary.size() + 1) + 0);
        String key = (String) distionary.keySet().toArray()[randomNum];
        return key;
    }

    public boolean checkValue(String key, String meaning) {
        if (this.distionary.get(key).contains(meaning)) {
            return true;
        }
        return false;
    }

    public boolean checkKey(String key, String meaning) {
        for (HashMap.Entry<String, List<String>> value1 : this.distionary.entrySet()){
            if (value1.getValue().contains(meaning)) {
               if(value1.getKey().toString().compareTo(key)==0)
                   return true;
            }
        }
        return false;
    }

}