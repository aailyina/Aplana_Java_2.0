package Task_5;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Operands {
    public static double inputData(String m, Scanner scanner){
        System.out.println(m);
        double d;
        try{
            d = scanner.nextDouble();
        }
        catch (InputMismatchException ex) {
            System.out.println("ОШИБКА!!! Можно вводить только числа.");
            throw new InputMismatchException("Вы ввели не число");
        }
        return d;
    }

}
