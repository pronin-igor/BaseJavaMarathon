package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String path = "day14.txt";
        File file = new File(path);
    }

    public static void printSumDigits(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String numbersString[] = scanner.nextLine().split(" ");

            if (numbersString.length != 10) {
                System.out.println("Некорректный входной файл");
                return;
            }

            int sum = 0;
            for (String numberString : numbersString) {
                sum += Integer.parseInt(numberString);
            }
            System.out.println(sum);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Файл не найден");
        }
    }
}
