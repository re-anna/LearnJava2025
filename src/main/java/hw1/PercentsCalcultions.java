package hw1;

public class PercentsCalcultions {
    public static void main(String[] args){
        double total = 10798;
        double part = 880;

        System.out.println(calculatePercentage(total, part));

    }

    public static double calculatePercentage(double total, double part){
        return (double) part / total * 100;
    }

}
