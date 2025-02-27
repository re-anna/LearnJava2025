package hw2;

public class Laptop {
    public static void main(String[] arg){

        Laptop firstLaptop = new Laptop("HP", 100000);

        firstLaptop.printInfo();

        firstLaptop.setPrice(70000);

        firstLaptop.printInfo();
    }

    String brand;
    double price;

    Laptop(String someBrand, double somePrice){
        this.brand = someBrand;
        this.price = somePrice;
    }

    String getBrand(){
        return this.brand;
    }

    double getPrice(){
        return this.price;
    }

    void setBrand(String newBrand){
        this.brand = newBrand;
    }

    void  setPrice(double newPrice){
        this.price = newPrice;
    }

    void printInfo(){
        System.out.println("Ноутбук: " + brand + ", Цена: " + price);
    }

}
