package CalcForUnitTest;

public class Addition {

        double sumNum;

        void addition(double firstNum, double secondNum) {
            sumNum = firstNum + secondNum;
            System.out.printf("Сумма: %.4f", sumNum);
        }

        public double getSumNum(double firstNum, double secondNum) {
            sumNum = firstNum + secondNum;
            return sumNum;
        }
    }
