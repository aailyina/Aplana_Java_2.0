package Task_1;

public class helloWorld {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_PURPLE = "\u001B[35m";

    public static void main(String[] arg) {
        System.out.println(ANSI_PURPLE + "Hello, world!" + ANSI_RESET);
    }
}