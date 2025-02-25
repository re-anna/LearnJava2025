package hw1;

public class CircleCalculations {
    public static void main( String[] args){
        double radius = 10.4;

        System.out.println(circleCircumference(radius));
    }

    public static double circleCircumference(double radius){
        return (double) 2 * radius * Math.PI;
    }
}
