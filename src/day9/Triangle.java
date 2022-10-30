package day9;

public class Triangle extends  Figure{
    int side1;
    int side2;
    int side3;

    public Triangle(int side1, int side2, int side3, String color){
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double area(){
        double p = (side1 + side2 + side3) / 2;
        double square = Math.sqrt((p-side1)*(p-side2)*(p-side3));
        return square;
    }

    public double perimeter(){
        double perimeter = side1 + side2 + side3;
        return perimeter;
    }
}
