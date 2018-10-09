package Task_5.Operations;

import Task_5.Show;

public class Multiplication implements Show {

    /**
     *
     * @param a - первое число
     * @param b - второе число
     * @return - возвращаемое значение
     */

    public Double solve(Double a, Double b) {
        return a*b;
    }

    public String getName() {
        return "*";
    }
}
