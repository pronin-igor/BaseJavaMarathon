package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        try {
            PrintWriter pw1 = new PrintWriter("file1.txt");
            PrintWriter pw2 = new PrintWriter("file2.txt");
            
            int randomNumber = 0;
            double groupSum = 0;
            for (int i = 0; i < 1000; i++) {
                randomNumber = (int) (Math.random() * 100);
                pw1.print(randomNumber + " ");

                groupSum += randomNumber;
                if (i % 20 == 0 && i !=0) {
                    pw2.print(groupSum / 20 + " ");
                    groupSum = 0;
                }
            }
            pw1.close();
            pw2.close();


            printResult(new File("file2.txt"));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String lineArray[] = line.split(" ");
            double lineArraySum = 0;
            for (String element: lineArray) {
                lineArraySum += Double.parseDouble(element);
            }
            System.out.println((int) lineArraySum);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
