package Assignment2;

public class Beverages extends Product {

    String dateOfExpiration;

    public Beverages(String nameOfProduct, String brand, double price, String dateOfExpiration) {
        super(nameOfProduct, brand, price);
        this.dateOfExpiration = dateOfExpiration;
    }


}
