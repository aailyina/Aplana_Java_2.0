import java.util.Scanner;

public class Calculator {
    double i,j;
    void calc () {
        //Класс Scanner необходим для получения консольного ввода данных
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите первое число. Дробная часть вводится через запятую.");
        i = scanner1.nextDouble();
        System.out.println("Введите второе число. Дробная часть вводится через запятую.");
        j = scanner2.nextDouble();
        System.out.printf("Сумма равна:" + ("%.4f"), (i + j));
    }
}
