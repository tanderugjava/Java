package day9;

public class Rectangle extends Figure {
    private int width;
    int height;

    public Rectangle(int width, int height, String color){
        super(color);
        this.width = width;
        this.height = height;
    }

    public double area(){
        double square = width * height;
        return square;
    }

    public double perimeter(){
        double p = 2 * (width + height);
        return p;
    }
}
