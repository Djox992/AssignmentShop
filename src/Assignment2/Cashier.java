package Assignment2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cashier extends Product{
   public Integer productApples;
    public static Integer quantityOfApples;
    public Integer productMilk;
    public Integer quantityOfMilks;
    public Integer productTshirt;
    public Integer quantityOfTshirts;
    public Integer productLaptop;
    public Integer quantityOfLaptop;

    Food food = new Food("Apples","BrandA", 1.50, "2022-06-14" );
    Beverages beverages = new Beverages("Milk","BrandM", 0.99, "2022-02-02");
    Clothes clothes = new Clothes("T-shirt", "BrandT",15.99, "M" ,"violet");
    Appliances appliances = new Appliances("Laptop", "BrandL",2345,"ModelL", "2021-03-03",1.125);

            public Cashier() {

                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                LocalDateTime now = LocalDateTime.now();

                System.out.println("Wellcome");


                ArrayList<List<Object> > cashier
                        = new ArrayList<>();



                while (true) {

                    Scanner keyboard = new Scanner(System.in);

                    System.out.println("Which product would you like?");
                    System.out.println("1. Food");
                    System.out.println("2. Beverages");
                    System.out.println("3. Clothes");
                    System.out.println("4. Appliance");
                    System.out.println("5. Pay");

                    int choice = keyboard.nextInt();



                    switch (choice) {
                        case 1:
                            Scanner keyboardFood = new Scanner(System.in);

                            System.out.println("Which product would you like?");
                            System.out.println("1. Apples");
                            productApples = keyboardFood.nextInt();

                            System.out.println("Quantity");
                            quantityOfApples = keyboardFood.nextInt();



                            List<Object> list1
                                    = new ArrayList<>(5);

                            list1.add(food.getNameOfProduct());
                            list1.add(food.getBrand());
                            list1.add(quantityOfApples);
                            list1.add(food.getPrice());
                            list1.add(food.getPrice()*quantityOfApples);

                            cashier.add(list1);



                                    break;
                        case 2:
                             Scanner keyboardBeverage = new Scanner(System.in);

                             System.out.println("Which product would you like?");
                             System.out.println("1. Milk");
                              productMilk = keyboardBeverage.nextInt();
                            System.out.println("Quantity");
                             quantityOfMilks = keyboardBeverage.nextInt();

                            List<Object> list2
                                    = new ArrayList<Object>();
                            list2.add(beverages.getNameOfProduct());
                            list2.add(beverages.getBrand());
                            list2.add(quantityOfMilks);
                            list2.add(beverages.getPrice());
                            list2.add(beverages.getPrice()*quantityOfMilks);
                            cashier.add(list2);


                            break;
                        case 3:
                            Scanner keyboardClothes = new Scanner(System.in);

                            System.out.println("Which product would you like?");
                            System.out.println("1. T-shirt");
                             productTshirt = keyboardClothes.nextInt();
                            System.out.println("Quantity");
                             quantityOfTshirts = keyboardClothes.nextInt();
                            List<Object> list3
                                    = new ArrayList<Object>();
                            list3.add(clothes.getNameOfProduct());
                            list3.add(clothes.getBrand());
                            list3.add(quantityOfTshirts);
                            list3.add(clothes.getPrice());
                            list3.add(clothes.getPrice()*quantityOfTshirts);
                            cashier.add(list3);

                            break;
                        case 4:
                            Scanner keyboardAppliance = new Scanner(System.in);

                            System.out.println("Which product would you like?");
                            System.out.println("1. Laptop");
                             productLaptop = keyboardAppliance.nextInt();
                            System.out.println("Quantity");
                             quantityOfLaptop = keyboardAppliance.nextInt();
                            List<Object> list4
                                    = new ArrayList<>();
                            list4.add(appliances.getNameOfProduct());
                            list4.add(appliances.getBrand());
                            list4.add(quantityOfLaptop);
                            list4.add(appliances.getPrice());
                            list4.add(appliances.getPrice()*quantityOfLaptop);
                            cashier.add(list4);
                            break;


                        case 5:
                            System.out.printf("%n");
                            System.out.println(dtf.format(now));
                            System.out.printf("%n");
                            System.out.println(iterateUsingForEach(cashier));
                            return;
                }

                    System.out.println("-------------------------------" );
                }











            }
 public static <K> boolean
    iterateUsingForEach(List<List<K> > listOfLists)
    {
        List<Double> total
                = new ArrayList<Double>();

        for (List<K> list : listOfLists) {


            for (int i = 0, listSize = list.size(); i < 2; i++) {
                K item = list.get(i);


                System.out.print( item + " ");


            }
            System.out.printf("%n");
            System.out.println(list.get(2) +" x " +"$"+list.get(3) + " = " + "$"+list.get(4));

                    total.add((Double) list.get(4));





            System.out.printf("%n");
        }
        System.out.printf("%n");
        System.out.println("-------------------------------" );
        double sum = 0;
        for (double i : total)
            sum = sum + i;


        System.out.println("TOTAL = " + "$"+sum );

        return false;
    }

}
