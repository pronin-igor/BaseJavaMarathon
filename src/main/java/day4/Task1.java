package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] mas = new int[n];
        int moreEight = 0;
        int equalsOne = 0;
        int even = 0;
        int odd = 0;
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 10);

            if (mas[i] > 8) {
                moreEight +=1;
            }
            if (mas[i] == 1) {
                equalsOne +=1;
            }
            if (mas[i] % 2 == 1) {
                even +=1;
            } else {
                odd +=1;
            }
            sum += mas[i];
        }
        System.out.println(Arrays.toString(mas));

        System.out.println("Длина массива: " + n);
        System.out.println("Колличество символов больше 8: " + moreEight);
        System.out.println("Колличество чисел равных 1: " + equalsOne);
        System.out.println("Колличество четных чисел: " + even);
        System.out.println("Колличество нечетных чисел: " + odd);
        System.out.println("Сумма всех элементов массива: " + sum);
        scanner.close();
    }
}
