package Task_6;

import java.io.*;
import java.util.*;

public class Word {
    public static void main(String[] args) {

        File word = new File("C:/Users/user/IdeaProjects/First_project/src/main/slova.txt");
        Scanner scan = null;
        try {
            scan = new Scanner(word);
        }
        catch (FileNotFoundException e) {
            System.out.println("Файл " + word.getName() + " не существует. Необходимо создать файл и заново запустить программу.");
            System.exit(0);
        }
        System.out.println("Файл существует! Идем дальше.");
        System.out.println();

        //Выводим данные, считанные из файла
        String sCurrentLine;
        ArrayList<String> arr = new ArrayList<String>();
        try (BufferedReader br = new BufferedReader(new FileReader("C:/Users/user/IdeaProjects/First_project/src/main/slova.txt"))) {
            while ((sCurrentLine = br.readLine()) != null) {
                arr.add(sCurrentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Данные, считанные из файла:");
        System.out.println(arr);
        System.out.println();

        // Считаем и сортируем слова из файла
        TreeMap<String, Integer> allWords = new TreeMap<>();
        List<String> maxWords = new ArrayList<>();
        Integer maxNumber = 0;

        // Слова, встречающиеся несколько раз. В статистике выводятся уже отсортированные слова без повторений.
        while (scan.hasNext()) {
            String userwords = scan.useDelimiter("\\s+").next();
            //allWords.put(userwords, allWords.getOrDefault(userwords, 0)+1);
            int oldCount = allWords.getOrDefault(userwords, 0);
            int newCount = oldCount + 1;
            allWords.put(userwords, newCount);

            if (maxNumber < newCount) {
                maxNumber = newCount;
                maxWords.clear();
                maxWords.add(userwords);
            } else if (maxNumber.equals(newCount)) {
                maxWords.add(userwords);
            }
        }

        System.out.println("Отсортированные слова с количеством повторений:");
        System.out.println(allWords);
        System.out.println();
        System.out.println("Чаще всего, встречается слово: " + maxWords);
        System.out.println();
        System.out.printf("Количество повторений:" + maxNumber);
        System.out.println();
        scan.close();
        }
}
