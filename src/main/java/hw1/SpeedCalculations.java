package hw1;

public class SpeedCalculations {
    public static void main(String[] args){

        int time = 60;
        int distance = 100;


        System.out.println("скорость = расстояние / время " + "\n" + avergeSpeed(distance, time) + " = " + distance + "/" + time);
    }

    public static double avergeSpeed(int distance, int time){
        return (double) distance / time;
    }
}
