package CalcForUnitTest;

public class Substraction {
    double subNum;

    void substract(double firstNum, double secondNum) {
        if(secondNum == 0){
            throw new ArithmeticException("Делить на ноль нельзя!!!");
        }
        subNum = firstNum / secondNum;
        System.out.printf("Частное: %.4f", subNum);
    }
    public double getSubNum(double firstNum, double secondNum) {
        subNum = firstNum / secondNum;
        return subNum;
    }
}
