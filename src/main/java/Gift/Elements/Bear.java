package Gift.Elements;

public class Bear extends Calculate {
    private String name;
    private int ves;
    private double price;

    public Bear(int id, String name, int ves, double price) {
        super(id);
        this.name = name;
        this.ves = ves;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVes() {
        return ves;
    }

    public void setVes(int ves) {
        this.ves = ves;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bear = " + super.toString() + ", Name = " + name + ", Ves = " + ves + ", Price = " + price;
    }
}
