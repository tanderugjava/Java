package day15;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args)  {
        File file = new File("src/resources/shoes.csv");
        File file1 = new File("missingShoes");
        try {
            Scanner scanner = new Scanner(file);
            try {
                PrintWriter pw = new PrintWriter(file1);
                while (scanner.hasNextLine()) {
                    String[] test = scanner.nextLine().split(";");
                    if (Integer.parseInt(test[2]) == 0) {
                        pw.println(Arrays.toString(test));
                    }
                }
                pw.close();
            } catch (FileNotFoundException e) {
                System.out.println("Ошибка при создании файла");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}



