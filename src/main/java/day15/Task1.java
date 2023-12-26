package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String path = "src/main/resources/shoes.csv";
        File file = new File(path);
        parseCsvToTxt(file);
    }

    public static void parseCsvToTxt(File file) {
        try {
            Scanner scanner = new Scanner(file);
            PrintWriter pw = new PrintWriter("src/main/resources/missing_shoes.txt");

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String splitLine[] = line.split(";");
                if (splitLine.length != 3) {
                    throw new MyException("Некорректный файл");
                }
                if (splitLine[2].equals("0")) {
                    pw.println(String.join(",", splitLine)); 
                }
            }
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
