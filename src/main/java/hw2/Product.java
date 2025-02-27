package hw2;

public class Product {
    public static void main(String[] arg){

        Product firstProduct = new Product("Газировка", 100.4);

        double discount = 0.05;

        firstProduct.printInfo();

        firstProduct.setPrice(500);

        firstProduct.applyDiscount(discount);

        firstProduct.printInfo();


    }

    String name;
    double price;

    Product(String someName, double somePrice){
        this.name = someName;
        this.price = somePrice;
    }


    String getName(){
        return this.name;
    }

    double getPrice(){
        return this.price;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void setPrice(double newPrice){
        this.price = newPrice;
    }

    public double applyDiscount(double discount){
        price = price * (1 - discount);
        return price;
    }

   void printInfo(){
        System.out.println("Товар: " + name + ", Цена: " + price);
    }


}
