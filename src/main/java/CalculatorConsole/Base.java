package CalculatorConsole;

/**
 * created by Anna 18.07.18
 * @author anna
 */

public class Base {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static void main(String[] arg) {
        System.out.println(ANSI_PURPLE + "Hello, world!" + ANSI_RESET);
        Check prog = new Check();
        prog.CheckProgram();
    }
}