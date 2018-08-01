import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Gift {
    void choose() {
        int i, j;
        int[] array2;
        array2 = new int[3];
        String [] sum;
        sum = new String[4];
        String array[][] = {
                {"ID", "Название", "Вес, г", "Цена, руб."},
                {"1", "Конфета", "100", "250"},
                {"2", "Чупа-чупс", "10", "100"},
                {"3", "Мороженое", "229", "140"},
                {"4", "Игрушка", "300", "555"},
                {"5", "Мармелад", "15", "234"},
                {"6", "Свисток", "50", "34"}
        };
        for (i = 0; i < 7; i++) { //Выводим список всех подарков
            for (j = 0; j < 4; j++)
                System.out.print(array[i][j] + "        ");
            System.out.println();
        }
        Integer[] ints = new Integer[10]; //Создаем и заполняем последовательность из 10-ти элементов
        for (i = 0; i < ints.length; i++) {
            ints[i] = i;
        }
        //System.out.println("Случайные элементы");
        List<Integer> lst = Arrays.asList(ints); //Перетасовка элементов в последовательности
        Collections.shuffle(lst);
        ints = lst.toArray(ints);
        /*for (int x : ints) {
            System.out.print(x);
        }*/
        //System.out.println(); //Выбор трех элементов из последовательности
        for (i = 0; i < 3; i++)
            for (j = 0; j < ints.length; j++) {
                if (ints[j] < 7 && ints[j] != 0) {
                    array2[i] = ints[j];
         //           System.out.print(array2[i]);
                    ints[j] = 10;
                    break;
                }
            }
        System.out.println(" ");
        System.out.println("Сформирован подарочек!");
        for (i = 0; i < 7; i++) { // Формируем и выводим подарочек на консоль
            for (int g = 0; g <= 3; g++) {
                if (i == array2[0] || i == array2[1] || i == array2[2]) {
                    System.out.print(array[i][g] + "        " );
                }
            }
            if (i == array2[0] || i == array2[1] || i == array2[2]) System.out.println(" ");
        }
        int ves =0, price=0;
        for (i=0; i<7; i++) // Считаем общий вес и общую сумму подарка.
            if (i==array2[0] || i == array2[1] || i == array2[2]) {
                ves += Integer.parseInt(array[i][2]);
                price += Integer.parseInt(array[i][3]);
            }
            System.out.println("Общий вес подарка = " + ves +" г.");
            System.out.println("Общая стоимость подарка = " + price + " руб.");


    }
}
