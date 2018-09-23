package Task_2_and_3;

import java.util.Scanner;

public class Calculate {
    double i,j;
    Scanner scanner = new Scanner(System.in);
    void arguments () {
        System.out.println("Введите первое число. Дробная часть вводится через запятую.");
        i = scanner.nextDouble();
        System.out.println("Введите второе число. Дробная часть вводится через запятую.");
        j = scanner.nextDouble();
    }
        void addition () { //метод для сложения двух чисел
            arguments();
            System.out.printf("Результат сложения:" + ("%.4f"), (i + j));
        }
        void subtraction () { //метод для вычитания двух чисел
            arguments();
            System.out.printf("Результат вычитания:" + ("%.4f"), (i - j));
        }
        void division () { //метод для деления двух чисел
            arguments();
            if ( j>0 )
                System.out.printf("Результат деления:" + ("%.4f"), (i / j));
            else {
                System.out.println("На ноль делить нельзя!!!!");
                division();
            }
        }
        void multiplication() { //метод для умножения двух чисел
            arguments();
            System.out.printf("Результат умножения:" + ("%.4f"), (i * j));
        }
}
