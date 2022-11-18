import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        SlangWords dic = new SlangWords();
        Data heloo= new Data();

        heloo.readFile("slang.txt",dic);
        Search f = new Search();
//        heloo.toString();
        System.out.println("Hello world!");
    }
}
