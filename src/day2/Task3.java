package day2;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a:");
        int a = scanner.nextInt();
        System.out.println("Введите число b:");
        int b = scanner.nextInt();
        if (a >= b) {
            System.out.println("Некорректный ввод");
        } else {
            a += 1;
            while(a < b){
                if(a % 5 == 0 && a % 10 != 0)
                    System.out.print(a + " ");

                a++;
                }
            }
        }
    }
