package Task_4_2.Elements;

public class Bear extends Calculate {
    private String color;

    public Bear(String name, int ves, double price, String color) {
        super(name, ves, price);
        this.color = color;
    }

    public String getPostavchik() {
        return color;
    }

    public void setPostavchik(String postavchik) {
        this.color = postavchik;
    }

    @Override
    public String toString() {
        return super.toString() + ", Color " + color;
    }
}
