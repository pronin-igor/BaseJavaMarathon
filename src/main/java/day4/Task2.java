package day4;

import java.util.Arrays;

public class Task2 {
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 10000;
    public static void main(String[] args) {
        int[] mas = new int[100];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * (Task2.MAX_VALUE - Task2.MIN_VALUE) + Task2.MIN_VALUE);
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int lastZero = 0;
        int lastZeroSum = 0;
        for (int el: mas) {
            if (el > max) {
                max = el;
            }
            if (el < min) {
                min = el;
            }
            if (el % 10 == 0) {
                lastZero +=1;
                lastZeroSum += el;
            }
        }
        System.out.println(Arrays.toString(mas));
        System.out.println(min);
        System.out.println(max);
        System.out.println(lastZero);
        System.out.println(lastZeroSum);
    }
}
