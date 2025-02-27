package hw2;

public class Rectngle {
    public static void main(String[] arg){
        Rectngle firstRectangle = new Rectngle(100,9);

        System.out.println("Площадь прямоугольнка равна: " + firstRectangle.calculateArea());

        firstRectangle.setWidth(1000);

        System.out.println("Площадь прямоугольнка равна: " + firstRectangle.calculateArea());

    }

    int width;
    int height;


    Rectngle(int someWidth, int someHeight){
        this.width = someWidth;
        this.height = someHeight;
    }

    int getWidth(){
        return this.width;
    }

    int getHeight(){
        return this.height;
    }

    void setWidth(int newWidth){
        this.width = newWidth;
    }

    int calculateArea(){
        return width*height;
    }
}
