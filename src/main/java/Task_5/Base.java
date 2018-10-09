package Task_5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Scanner scanner1 = new Scanner(System.in);
            try {
                    Double firstOperand = Operands.inputData("Введите первое число, дробная часть вводится через запятую:", scanner);
                    Double secondOperand = Operands.inputData("Введите второе число, дробная часть вводится через запятую: ", scanner1);
                    Show operation = new ChooseOperation().chooseOperation("Выберите операцию: +, -, *, /");

                    Double result = operation.solve(firstOperand, secondOperand);
                    System.out.printf(firstOperand + " " + operation.getName() + " " + secondOperand + " = ");
                    System.out.printf("%.4f%n", result);
                }

                catch (InputMismatchException ex) {
                    System.out.println("ОШИБКА!!! Пожалуйста, введите числа");
                }

                catch (ArithmeticException ex) {
                    System.out.println("ОШИБКА!!! На ноль делить нельзя!");
                }
        }
}
