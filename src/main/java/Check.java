import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.text.BreakIterator;
import java.util.Scanner;

public class Check {
    int i;
    Scanner scanner = new Scanner(System.in);
    Operands calc = new Operands();
    Massive mas = new Massive();

    void CheckOperation() {  //Метод выбора операции для калькулятора
        System.out.println("Выберите операцию: 1-сложение, 2-вычитаение, 3-деление, 4-умножение");
        try {
            i = scanner.nextInt();
            switch (i) {
                case 1:
                    calc.addition();
                    break;
                case 2:
                    calc.subtraction();
                    break;
                case 3:
                    calc.division();
                    break;
                case 4:
                    calc.multiplication();
                    break;
                default:
                    System.out.println("В списке операций нет такого значения.");
                    CheckOperation();
            }
        }
                catch (java.util.InputMismatchException ex) {
            System.out.println("Только цифры!!! Ну что, запускай заново)");
        }
    }

    void CheckProgram() { // метод для выбора программы. Калькулятор или поиск максимального слово в массиве.
        System.out.println("Выберите какая программа будет выполняться. 1-калькулято, 2-массив слов.");
        try {
            i = scanner.nextInt();
            switch (i) {
                case 1:
                    CheckOperation();
                    break;
                case 2:
                    mas.mass();
                    break;
                default:
                    System.out.println("Нет такого значения.");
                    CheckProgram();
            }
        }
        catch (java.util.InputMismatchException ex) {
            System.out.println("Только цифры!!! Ну что, запускай заново)");
        }
    }
    }



