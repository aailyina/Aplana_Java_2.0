package CalculatorConsole;

import java.util.Scanner; //Класс Scanner необходим для получения консольного ввода данных

public class Operands {
        double i,j;
        Scanner scanner = new Scanner(System.in);
        void addition () { //метод для сложения двух чисел
            System.out.println("Введите первое число. Дробная часть вводится через запятую.");
            i = scanner.nextDouble();
            System.out.println("Введите второе число. Дробная часть вводится через запятую.");
            j = scanner.nextDouble();
            System.out.printf("Результат сложения:" + ("%.4f"), (i + j));
        }
        void subtraction () { //метод для вычитания двух чисел
            System.out.println("Введите первое число. Дробная часть вводится через запятую.");
            i = scanner.nextDouble();
            System.out.println("Введите второе число. Дробная часть вводится через запятую.");
            j = scanner.nextDouble();
            System.out.printf("Результат вычитания:" + ("%.4f"), (i - j));
        }
        void division () { //метод для деления двух чисел
            System.out.println("Введите первое число. Дробная часть вводится через запятую.");
            i = scanner.nextDouble();
            System.out.println("Введите второе число. Дробная часть вводится через запятую.");
            j = scanner.nextDouble();
            if ( j>0 )
                System.out.printf("Результат деления:" + ("%.4f"), (i / j));
            else {
                System.out.println("На ноль делить нельзя!!!!");
                division();
            }
        }
        void multiplication() { //метод для умножения двух чисел
            System.out.println("Введите первое число. Дробная часть вводится через запятую.");
            i = scanner.nextDouble();
            System.out.println("Введите второе число. Дробная часть вводится через запятую.");
            j = scanner.nextDouble();
            System.out.printf("Результат умножения:" + ("%.4f"), (i * j));
        }
    }
