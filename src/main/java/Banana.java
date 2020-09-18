public class Banana  implements Fruits{
    private String mane;
    private double price;

    public Banana() {
        this.mane = "banana";
        this.price = 2.00;
    }
    @Override
    public String getNAme() {
        return mane;
    }
}
