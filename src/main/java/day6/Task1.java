package day6;

import day7.Airplane;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("nordwind", 2000, 20, 30000);
        airplane.setLength(30);
        airplane.setYear(2020);
        airplane.fillUp(50);
        airplane.fillUp(100);
        airplane.info();
    }
}
