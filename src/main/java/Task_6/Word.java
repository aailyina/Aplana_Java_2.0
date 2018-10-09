package Task_6;
import java.io.*;
import java.util.*;

public class Word {
    public static void main(String[] args) {
        Scanner scan = new Scanner("src/main/Words.txt");
        File word = new File("src/main/Words.txt");
        if ( word.exists() == false) {
            System.out.println("Файл " + word.getName() + " не существует. Необходимо создать файл");
            System.exit(0);
        }
        System.out.println("Файл существует! Идем дальше.");

        ArrayList<String> arr = new ArrayList<String>();
        try
            (BufferedReader br = new BufferedReader(new FileReader("src/main/Words.txt"))) {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                arr.add(sCurrentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(arr);
        System.out.println(arr.size());
    }
}

