package hw1;

public class MathOperations {
    public static void main(String[] args){

        System.out.println("x + y = " + MathOperations.add(4,5));
        System.out.println("x - y = " + MathOperations.subtract(1,5));
        System.out.println("x * y = " + MathOperations.multiply(3,7));
        System.out.println("x / y = " + MathOperations.divide(5, 2));

        System.out.println("Максимальное число из двух - " + MathOperations.findMax(100,4));

        System.out.println("Разность двух чисел равна " + MathOperations.difference(299,22));

        System.out.println("Площадь квадрата равна " + MathOperations.squareArea(5.3));
        System.out.println("Периметр квадрата равен " + MathOperations.squarePerimeter(5.3));

        int seconds = 100;
        System.out.println("Минуты: " + MathOperations.convertSecondsToMinutes(seconds) + " = секунд: " + seconds);
    }


    public static int add(int x, int y){
    return x + y;
}

    public static int subtract(int x, int y){
        return x - y;
    }

    public static int multiply(int x, int y){
        return x * y;
    }

    public static double divide( int x, int y){
        return (double) x / y;
    }

    public static int findMax(int a, int b){
        return Math.max(a,b);
    }

    public static int difference(int a, int b){
        return Math.subtractExact(a,b);
    }

    public static double squareArea(double a){
        return (double) a * a;
    }

    public static double squarePerimeter( double a){
        return (double) a * 4;
    }

    public static double convertSecondsToMinutes(int seconds){
        return (double) seconds/60;
    }
}
