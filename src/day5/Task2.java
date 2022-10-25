package day5;

public class Task2 {
    public static void main(String[] args) {
        Motorbike bike1 = new Motorbike("BMW", "Black", 2020);
        bike1.getInfo();
    }
}

class Motorbike{
    private String model;
    private String color;
    private int year;

    public Motorbike(String model, String color, int year){
        this.model = model;
        this.color = color;
        this.year = year;
    }
    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }
    public int getYear(){
        return year;
    }

    public void getInfo(){
        System.out.println("У меня есть мотоцикл модели " + model + ", цвета " + color + ", год выпуска " + year);
    }
}