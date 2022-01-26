package Assignment2;

public class Clothes extends  Product {

    String size;
    String color;

    public Clothes(String nameOfProduct, String brand, double price, String size, String color) {
        super(nameOfProduct, brand, price);
        this.size = size;
        this.color = color;
    }


}




