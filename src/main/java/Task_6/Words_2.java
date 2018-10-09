package Task_6;
import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;

public class Words_2 {
    public static void main(String[] args) {
        File words = new File("src/main/Wordss");
        Scanner scan = null;
        try {
            scan = new Scanner(words);
        }
        catch (FileNotFoundException e) {
            System.out.println("Необходимый файл отсутствует");
        }

        // Считаем и сортируем слова из файла
        Map<String, Integer> allWords = new TreeMap<>();

        List<String> maxWords = new ArrayList<>();
        Integer maxNumber = 0;

        // Слова, встречающиеся несколько раз
        while (scan.hasNext()) {
            String userwords = scan.useDelimiter("\\s+").next();
            Integer countWord = allWords.get(userwords);
            if (countWord == null) {
                countWord = 0;
            }
            allWords.put(userwords, ++countWord);

            // Слово, имеющее максимальное количество повторений
            if (maxNumber < countWord) {
                maxNumber = countWord;
                maxWords.clear();
                maxWords.add(userwords);
            } else if (maxNumber.equals(countWord)) {
                maxWords.add(userwords);
            }
        }
        System.out.println("Слова по порядку с количеством:");
        System.out.println(allWords);
        System.out.println("Чаще всего, встречается: " + maxWords);
        System.out.printf("Повторяет(ют)ся %d раз(a).", maxNumber);
        scan.close();
    }
}
