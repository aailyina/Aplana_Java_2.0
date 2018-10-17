package CalcForUnitTest;

public class Division {
    double divNum;

    void division(double firstNum, double secondNum) {
        divNum = firstNum - secondNum;
        System.out.printf("Разность: %.4f", divNum);
    }
    public double getDivNum(double firstNum, double secondNum) {
        divNum = firstNum - secondNum;
        return divNum;
    }
}