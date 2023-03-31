package Уроки1_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int j = 0; j <= 3; j++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите целое число");
            if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                System.out.println(i + " - целое, вводите следующее целоисленное!");
            } else {
                System.out.println("Вы ввели не целое число, программа завершается!");
                break;
            }
            if (j == 3) {
                System.out.println("Хватить наглеть, программа завершается");
            }
        }
    }
}