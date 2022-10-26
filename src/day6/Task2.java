package day6;

public class Task2 {
    public static void main(String[] args) {
    Airplane airplane = new Airplane("Boing", 2020, 50, 2000);
    airplane.setManufacturer("Airbus");
    airplane.setYear(2018);
    airplane.fillUp(100);
    airplane.fillUp(150);
    airplane.info();
    }
}
