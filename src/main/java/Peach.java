public class Peach implements Fruits {
    private String mane;
    private double price;

    public Peach() {
        this.mane = "peach";
        this.price = 4.00;
    }
    @Override
    public String getNAme() {
        return mane;
    }
}

