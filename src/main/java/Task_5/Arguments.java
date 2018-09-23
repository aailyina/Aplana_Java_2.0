package Task_5;

import java.util.Scanner;

public class Arguments extends Calculate {
    private double i,j;

    public Arguments(double i, double j) {
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
}
