package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("Kia");
        car1.setColor("White");
        car1.setYear(2018);
        car1.getInfo();

    }
}


class Car{
    private String model;
    private String color;
    private int year;

    public void setModel(String carModel) {
        model = carModel;
    }
    public String getModel(){
        return model;
    }

    public void setColor(String carColor){
        color = carColor;
    }
    public String getColor(){
        return color;
    }

    public void setYear(int carYear){
        year = carYear;
    }
    public int getYear(){
        return year;
    }
    public void getInfo(){
        System.out.println("У меня автомобиль модели " + model + ", цвета " + color + ", " + year + " года выпуска." );
    }
}
