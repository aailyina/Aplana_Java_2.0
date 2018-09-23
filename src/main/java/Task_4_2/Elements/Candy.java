package Task_4_2.Elements;

public class Candy extends Calculate {
    private String forma;

    public Candy(String name, int ves, double price, String forma) {
        super(name, ves, price);
        this.forma = forma;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    @Override
    public String toString() {
        return super.toString() + ", Forma " + forma;
    }
}
