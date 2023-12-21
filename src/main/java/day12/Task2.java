package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        fillArray(0, 30, list);
        fillArray(300, 350, list);
        System.out.println(list);
    }

    public static void fillArray(int from, int to, List<Integer> list) {
        for (int i = from; i < to; i ++) {
            if (i % 2 == 0) {
                list.add(i);
            }
        }
    }
}
