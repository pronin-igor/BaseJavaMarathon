package day4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] mas = new int[100];
        int threeSum = 0;
        int maxThreeSum = Integer.MIN_VALUE;
        int threeFirstElementIndex = 0;
        for (int i = 0; i < mas.length; i++) {
            if (i % 3 == 0) {
                if (threeSum > maxThreeSum) {
                    maxThreeSum = threeSum;
                    threeFirstElementIndex = i - 3;
                }

                threeSum = 0;
            }

            mas[i] = (int) (Math.random() * 10000);

            threeSum += mas[i];
        }
        System.out.println(Arrays.toString(mas));
        System.out.println(maxThreeSum);
        System.out.println(threeFirstElementIndex);
    }
}
