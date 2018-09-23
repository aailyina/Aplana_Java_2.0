package Task_4_2.Elements;

public class Lollipop extends Calculate {
    private String vkus;

    public Lollipop(String name, int ves, double price, String vkus) {
        super(name, ves, price);
        this.vkus = vkus;
    }

    @Override
    public String toString() {
        return super.toString() + ", Vkus " + vkus;
    }
}
