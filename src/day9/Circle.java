package day9;

public class Circle extends Figure{

    int radius;

    public Circle(int radius, String color){
        super(color);
        this.radius = radius;
    }

    public double area(){
        double square = Math.PI * radius*radius;
        return square;
    }

    public double perimeter(){
        double p = Math.PI * radius * 2;
        return  p;
    }
}
