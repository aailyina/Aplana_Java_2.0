package Task_2_and_3;

import java.util.Scanner;

public class Choose {
    int i;
    Scanner scanner = new Scanner(System.in);
    Calculate calc = new Calculate();
    Massive mas = new Massive();

    void chooseOperation() {
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
                    chooseOperation();
            }
        } catch (java.util.InputMismatchException ex) {
            System.out.println("Только цифры!!! Ну что, запускай заново)");
        }
    }

    void ChooseProgram() { // метод для выбора программы. Калькулятор или поиск максимального слово в массиве.
        System.out.println("Выберите какая программа будет выполняться. 1-калькулятор, 2-максимальная длина слова в массиве.");
        try {
            i = scanner.nextInt();
            switch (i) {
                case 1:
                    chooseOperation();
                    break;
                case 2:
                    mas.mass();
                    break;
                default:
                    System.out.println("Нет такого значения.");
                    ChooseProgram();
            }
        }
        catch (java.util.InputMismatchException ex) {
            System.out.println("Только цифры!!! Ну что, запускай заново)");
        }
    }
}
