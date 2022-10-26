package day4;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers =  new int[100];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(10001);
        }
        System.out.println();
        int max = numbers[0];
        for (Integer x : numbers) {
            if (x >= max) {
                max = x;
            }
        }
        System.out.println("наибольший элемент массива: " + max);

        int min = numbers[0];
        for (Integer x : numbers) {
            if (x <= min) {
                min = x;
            }
        }
        System.out.println("наименьший элемент массива: " + min);

        int ten = 0;
        int tensum = 0;
        for (Integer x : numbers) {
            if (x == 0 || x % 10 == 0) {
                ten++;
                tensum += x;
            }
        }
        System.out.println("количество элементов массива, оканчивающихся на 0: " + ten);
        System.out.println("сумма элементов массива, оканчивающихся на 0: " + tensum);
    }
}
