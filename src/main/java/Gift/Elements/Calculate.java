package Gift.Elements;

public abstract class Calculate {
    private int id;

    public Calculate(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "id [" + id + "]";
    }
}
