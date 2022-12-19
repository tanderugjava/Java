package day19.Task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Java\\src\\resources\\taxi_cars.txt");
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
            if((checkTaxi(entry.getValue().getX(), squareOne.getX(), squareTwo.getX()))&&
                    (checkTaxi(entry.getValue().getY(), squareOne.getY(), squareTwo.getY())))
            {
                System.out.println(count + ") " + entry.getKey());
                count++;
            }
        }
    }
    public static boolean checkTaxi(int entry, int squareOne, int squareTwo){
        if((entry > squareOne && entry < squareTwo) || (entry < squareOne && entry > squareTwo))
        {
            return true;
        }
        return false;
    }
}
