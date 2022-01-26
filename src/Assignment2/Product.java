package Assignment2;

public class Product{
    private String nameOfProduct;
    private String brand;
    private double price;


    public Product(String nameOfProduct, String brand, double price) {
        this.nameOfProduct = nameOfProduct;
        this.brand = brand;
        this.price = price;
    }

    public Product() {

    }


    @Override
    public String toString() {
        return "Product{" +
                "nameOfProduct='" + nameOfProduct + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
