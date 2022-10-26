package day4;

import java.util.Scanner;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Random rand = new Random();
        int[] massive = new int[n];
        for (int i = 0; i < massive.length; i++)
            massive[i] = rand.nextInt(11);

        for (Integer x : massive) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("Длина массива: " + massive.length);

        int count8 = 0;
        for (Integer x : massive) {
            if (x > 8) {
                count8++;
            }
        }
        System.out.println("Количестве чисел больше 8: " + count8);

        int count1 = 0;
        for (Integer x : massive) {
            if (x == 1) {
                count1++;
            }
        }
        System.out.println("Количестве чисел равных 1: " + count1);

        int even = 0;
        for (Integer x : massive) {
            if (x % 2 == 0) {
                even++;
            }
        }
        System.out.println("Количестве четных чисел: " + even);

        int odd = 0;
        for (Integer x : massive) {
            if (x % 2 != 0) {
                odd++;
            }
        }
        System.out.println("Количестве нечетных чисел: " + odd);

        int sum = 0;
        for (Integer x : massive) {
            sum += x;
        }
        System.out.println("Сумме всех элементов массива: " + sum);
    }
}
