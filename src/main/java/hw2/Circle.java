package hw2;

public class Circle {
    public static void main(String[] arg){

        Circle firstCircle = new Circle(3.4);

        firstCircle.calculateArea();
        firstCircle.calculateCircumference();

        System.out.println("Площадь круга равна " + firstCircle.calculateArea() +
                " Длина окружности равна " + firstCircle.calculateCircumference());

        firstCircle.setRadius(100);

        System.out.println("Площадь круга равна " + firstCircle.calculateArea() +
                " Длина окружности равна " + firstCircle.calculateCircumference());

    }

    double radius;

    Circle( double someRadius){
        this.radius = someRadius;
    }

    double getRadius(){
        return this.radius;
    }

    public void setRadius(double newRadius){
        this.radius = newRadius;
    }

    public double calculateArea(){
        return Math.PI * Math.pow(radius,2);
    }

    double calculateCircumference(){
        return 2 * Math.PI * radius;
    }

}
