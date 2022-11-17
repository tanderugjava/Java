package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("file1");
        File file1 = new File("file2");
        Random random = new Random();

        try (PrintWriter pw1 = new PrintWriter(file)) {
            int countNumbersFile = 1000;
            for (int i = 0; i < countNumbersFile; i++) {
                pw1.println(random.nextInt(100));
            }
        }

        try (Scanner scanner = new Scanner(file);
            PrintWriter pw2 = new PrintWriter(file1)){
            while (scanner.hasNextLine()) {
                int count = 20;
                double sum = 0;
                for (int i = 0; i < count; i++) {
                    sum += Integer.parseInt(scanner.nextLine());
                }
                System.out.println(sum);
                pw2.println(sum / count);
            }
        }
    }

    public static void printResult(File file) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(file)){
            while (scanner.hasNextLine()) {
                double sum;
                for (String x: scanner.nextLine()) {

                }


                }
            }

        }




}
}

