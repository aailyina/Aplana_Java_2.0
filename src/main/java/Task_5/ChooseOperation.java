package Task_5;
import Task_5.Operations.Addition;
import Task_5.Operations.Division;
import Task_5.Operations.Multiplication;
import Task_5.Operations.Subtraction;

import java.util.Scanner;

public class ChooseOperation {
    public Show someOper;
    private static Scanner scanner = new Scanner(System.in);
    protected Show chooseOperation(String message) {
        System.out.println(message);
        char oper = scanner.next().charAt(0);

        switch (oper) {
            case '+':
                someOper = new Addition();
                break;
            case '-':
                someOper = new Subtraction();
                break;
            case '*':
                someOper = new Multiplication();
                break;
            case '/':
                someOper = new Division();
                break;
            default:
                System.out.println("В списке операций нет такого значения.");
        }
        return someOper;
    }
}