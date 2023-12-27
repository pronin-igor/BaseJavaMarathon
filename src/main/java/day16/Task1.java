package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String path = "day14.txt";
        File file = new File(path);
        printResult(file);
    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String lineArray[] = line.split(" ");
            double sum = 0;
            for (String number: lineArray) {
                sum += Double.parseDouble(number);
            }
            double average = sum / (double) lineArray.length;
            System.out.print(average);
            System.out.printf(" --> %.3f", average, average);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}   
