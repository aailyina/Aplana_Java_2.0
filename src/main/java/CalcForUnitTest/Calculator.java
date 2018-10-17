package CalcForUnitTest;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println ("Введите первое число. Дробная часть вводится через запятую.");
        Scanner scan = new Scanner(System.in);
        double firstUserNum = scan.nextDouble();
        System.out.println ("Введите второе число. Дробная часть вводится через запятую.");
        double secondUserNum = scan.nextDouble();
        System.out.println("Выберите одну из операций: +,-,/,* ");
        String userArithOp = scan.next();
        String addition = "+";
        String substraction = "-";
        String multiplication = "*";
        String division = "/";



        if (userArithOp.equals(addition)) {
            Addition summa = new Addition();
            summa.addition(firstUserNum, secondUserNum);
            summa.getSumNum(firstUserNum, secondUserNum);
        }
        else {
            if (userArithOp.equals(substraction)) {
                Division raznost = new Division();
                raznost.division(firstUserNum, secondUserNum);
            }
            else {
                if (userArithOp.equals(multiplication)) {
                    Multiplication proizved = new Multiplication();
                    proizved.multiplic(firstUserNum, secondUserNum);
                } else {
                    if (userArithOp.equals(division)) {
                        Substraction delenie = new Substraction();
                        delenie.substract(firstUserNum, secondUserNum);
                    }
                    else {
                        System.out.print("Введены некорректные данные");
                    }
                }
            }
        }
    }
}
