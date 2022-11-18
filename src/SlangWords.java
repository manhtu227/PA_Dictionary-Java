import java.util.ArrayList;
import java.util.HashMap;

public class SlangWords {

    HashMap<String, ArrayList<String>>  distionary;
    public SlangWords() {
        this.distionary=new HashMap<String, ArrayList<String>>();
    }

    public HashMap<String, ArrayList<String>> getDistionary() {
        return distionary;
    }

    public void setDistionary(HashMap<String, ArrayList<String>> distionary) {
        this.distionary = distionary;
    }


}