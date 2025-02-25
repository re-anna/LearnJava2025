package hw1;

public class Hypotenuse {
    public static void main(String[] args){
    int fistSide = 9;
    int anotherSide = 10;

    System.out.println("Гипотенуза равна " + findHypotenuse(fistSide, anotherSide) + ", при а = " + fistSide + ", а b = " + anotherSide);
    }

    public static double findHypotenuse(double a, double b){
        return Math.sqrt((a * a) + (b * b));
    }

}
