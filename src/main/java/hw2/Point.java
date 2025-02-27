package hw2;

public class Point {
    public static void main(String[] arg){

        Point firstPoint = new Point(10,6);

        firstPoint.print();

        firstPoint.setX(7);

        firstPoint.print();

    }

    int x;
    int y;

    Point(int someX, int someY){
        this.x = someX;
        this.y = someY;
    }

    int getX(){
        return this.x;
    }

    int getY(){
        return this.y;
    }

     void setX(int newX){
        this.x = newX;
    }

    void setY(int newY){
        this.y = newY;
    }

    void print(){
        System.out.println("Координаты: x = " + x + ", y = " + y);
    }
}
