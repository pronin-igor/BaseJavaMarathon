package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.management.BadAttributeValueExpException;

public class Task2 {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();

        String path = "people.txt";
        File file = new File(path);
        list = parseFileToStringList(file);
        System.out.println(list);
    }

    public static List<Person> parseFileToStringList(File file) {
        List<Person> list = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String string = scanner.nextLine();
                String personString[] = string.split(" ");

                if (Integer.parseInt(personString[1]) < 0) {
                    throw new BadAttributeValueExpException(personString);
                }

                list.add(new Person(personString[0], Integer.parseInt(personString[1])));
            }
        } catch (BadAttributeValueExpException e) {
            System.out.println("Некорректный входной файл");
        } 
        catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        
        return list;
    }
}
