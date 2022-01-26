package Assignment2;

public class Appliances extends Product{

    String model;
    String productionDate;
    double weight;

    public Appliances(String nameOfProduct, String brand, double price, String model, String productionDate, double weight) {
        super(nameOfProduct, brand, price);
        this.model = model;
        this.productionDate = productionDate;
        this.weight = weight;
    }


}
