package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dividend;
        double divider;

        for (int i = 0; i < 5; i++) {
            dividend = sc.nextDouble();
            divider = sc.nextDouble();

            if (divider == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(dividend / divider);
        }
        sc.close();
    }
}
