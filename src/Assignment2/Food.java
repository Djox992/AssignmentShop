package Assignment2;

public class Food extends Product {

    String dateOfExpiration;


    public Food(String nameOfProduct, String brand, double price, String dateOfExpiration) {
        super(nameOfProduct, brand, price);
        this.dateOfExpiration = dateOfExpiration;
    }

    public Food() {

    }

  }
