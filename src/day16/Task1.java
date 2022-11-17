package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("test");
        printResult(file);
    }
    public static void printResult(File file){
        try (Scanner scanner = new Scanner(file)) {

            String[] numbers = scanner.nextLine().split(" ");

            double count = 0;
            double sum = 0;
            for (String x: numbers) {
                sum += Integer.parseInt(x);
                count++;
            }
            System.out.println(sum/count);

            System.out.printf("%.3f", sum/count);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
