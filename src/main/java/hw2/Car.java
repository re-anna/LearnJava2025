package hw2;

public class Car {
    public static void main(String[] arg){
        Car firstCar = new Car("TOYOTA", 2015);

        firstCar.print();

        firstCar.setYear(2025);

        firstCar.print();
    }

    String brand;
    int year;

    Car( String someBrand, int someYear){
        this.brand = someBrand;
        this.year = someYear;
    }

    String getBrand(){
        return brand;
    }

    int getYear(){
        return year;
    }

    void setBrand(String newBrand){
        this.brand = newBrand;
    }

    void setYear(int newYear){
        this.year = newYear;
    }

    void print(){
        System.out.println("Марка: " + brand + " Год выпуска: " + year);
    }

}
