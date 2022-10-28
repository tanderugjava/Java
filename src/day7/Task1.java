package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 2020, 50, 2000);
        Airplane airplane1 = new Airplane("Airbus", 2019, 55, 2100);
        Airplane.compareAirplanes(airplane, airplane1);
    }
}
