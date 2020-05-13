package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите положительное число");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Random random = new Random();

        int sumLeft = 0;
        int sumRight = 0;
        if (n % 2 != 0) {
            System.out.println("Вы ввели не подходящее число");
        } else {
            int[] array = new int[n];
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(15);
            }
            System.out.println(Arrays.toString(array));
            for (int i = 0; i < array.length / 2; i++) {
                sumLeft += array[i];
            }
            for (int i = array.length / 2; i < array.length; i++) {
                sumRight += array[i];
            }
            if (sumLeft > sumRight) {
                System.out.println("Сумма модулей элементов слева больше, чем сумма модулей элементов справа ");
            } else if (sumLeft < sumRight) {
                System.out.println("Сумма модулей элементов слева меньше, чем сумма модулей элементов справа ");
            } else if (sumLeft == sumRight) {
                System.out.println("Сумма модулей элементов слева равна сумма модулей элементов справа ");

            }
        }

    }
}
