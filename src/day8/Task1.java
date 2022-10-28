package day8;

public class Task1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String s1 = "";
        for(int i = 0; i < 20001; i++){
            s1 = s1 + i + " ";
        }
        long stopTime = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: " + (stopTime - startTime));

        long startTime1 = System.currentTimeMillis();
        StringBuilder s2 = new StringBuilder();
        for(int i = 0; i < 20001; i++){
            s2.append(i).append(" ");
        }
        long stopTime1 = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: " + (stopTime1 - startTime1));
    }
}
