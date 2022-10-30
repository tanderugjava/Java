package day9;

public abstract class Figure {
    String color;

    public Figure(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public abstract double area();
    public abstract double perimeter();

}
