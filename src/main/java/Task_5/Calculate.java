package Task_5;

import java.util.Scanner;

public abstract class Calculate {
    private double i,j;

    public Calculate(double i, double j) {
        this.i = i;
        this.j = j;
    }

    public double getI() {
        return i;
    }

    public void setI(double i) {
        this.i = i;
    }

    public double getJ() {
        return j;
    }

    public void setJ(double j) {
        this.j = j;
    }

    @Override

    Scanner scanner = new Scanner(System.in);
    public void arguments () {
        System.out.println("Введите первое число. Дробная часть вводится через запятую.");
        i = scanner.nextDouble();
        System.out.println("Введите второе число. Дробная часть вводится через запятую.");
        j = scanner.nextDouble();
    }
    public void addition () { //метод для сложения двух чисел
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
