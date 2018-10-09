package Task_5.Operations;

import Task_5.Show;

public class Division implements Show {

    /**
     *
     * @param a - первое число
     * @param b - второе число
     * @return - возвращаемое значение
     */

    public Double solve(Double a, Double b) {
        if(b==0) throw new ArithmeticException("поделили на ноль");
        return a/b;
    }

    public String getName() {
        return "/";
    }
}
