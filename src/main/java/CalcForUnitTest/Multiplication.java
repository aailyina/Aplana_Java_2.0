package CalcForUnitTest;

public class Multiplication {
    double multiNum;

    void multiplic (double firstNum, double secondNum) {
        multiNum = firstNum * secondNum;
        System.out.printf("Произведение: %.4f", multiNum);
    }
    public double getMultiNum(double firstNum, double secondNum) {
        multiNum = firstNum * secondNum;
        return multiNum;
    }
}
