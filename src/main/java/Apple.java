public class Apple implements Fruits {
    private String mane;
    private double price;

    public Apple() {
        this.mane = "apple";
        this.price = 1.00;
    }

    @Override
    public String getNAme() {
        return mane;
    }
}


