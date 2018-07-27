import java.util.Scanner;

public class Massive {
    void mass() {
        Scanner scanner = new Scanner(System.in);
        int i, j,max;
        String zn=null;
        System.out.println("Введите длину массива");
        i = scanner.nextInt(); //задаем длину массива
        String[] arr = new String[i];
        for (j = 0; j < i; j++) { //в цикле вводим элементы массива
            System.out.println("Введите " + (j + 1) + " элемент массива. Вводить необходимо без пробела, по одному слову.");
            arr[j] = scanner.next();
        }
        System.out.println("Массив:");
        for (j = 0; j < i; j++) //выводим массив
            System.out.println(arr[j]);
        max=0;
        for (j=0; j<i; j++) //в цикле ищем максимальную длину элемента массива
            if (arr[j].length()>=max) {
            max=arr[j].length();
            zn=arr[j];
            }
        System.out.println("Самое длинное слово " + zn + " .Его длина составляет " +  max + " символов!");
    }
}
