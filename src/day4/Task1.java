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

        int s = 0;
        for (Integer x : massive) {
            if (x > 8) {
                s++;
            }
        }
        System.out.println("Количестве чисел больше 8: " + s);

        int q = 0;
        for (Integer x : massive) {
            if (x == 1) {
                q++;
            }
        }
        System.out.println("Количестве чисел равных 1: " + q);

        int w = 0;
        for (Integer x : massive) {
            if (x % 2 == 0) {
                w++;
            }
        }
        System.out.println("Количестве четных чисел: " + w);

        int e = 0;
        for (Integer x : massive) {
            if (x % 2 != 0) {
                e++;
            }
        }
        System.out.println("Количестве нечетных чисел: " + e);

        int r = 0;
        for (Integer x : massive) {
            r += x;
        }
        System.out.println("Сумме всех элементов массива: " + r);
    }
}
