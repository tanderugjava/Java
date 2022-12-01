package day19.Task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\user\\Desktop\\Java\\src\\resources\\taxi_cars.txt");
        Scanner scanner = new Scanner(file);
        Map<Integer, Point> map = new HashMap<>();

        while (scanner.hasNextLine()){
            map.put(scanner.nextInt(), new Point(scanner.nextInt(), scanner.nextInt()));
        }

        System.out.println(map);


        Scanner scannerInput = new Scanner(System.in);
        System.out.print("Введите два числа первой точки координат квадрата: ");
        Point squareOne = new Point(scannerInput.nextInt(), scannerInput.nextInt());
        System.out.println(squareOne);

        System.out.print("Введите два числа второй точки координат квадрата: ");
        Point squareTwo = new Point(scannerInput.nextInt(), scannerInput.nextInt());
        System.out.println(squareTwo);

        int count = 1;

        for (Map.Entry<Integer, Point> entry: map.entrySet())
                {
            if(((entry.getValue().getX() > squareOne.getX() && entry.getValue().getX() < squareTwo.getX()) ||
                    (entry.getValue().getX() < squareOne.getX() && entry.getValue().getX() > squareTwo.getX())) &&
                            ((entry.getValue().getY() > squareOne.getY() && entry.getValue().getY() < squareTwo.getY()) ||
                                    (entry.getValue().getY() < squareOne.getY() && entry.getValue().getY() > squareTwo.getY()))){
                System.out.println(count + ") " + entry.getKey());
                count++;
            }
        }
    }
}
