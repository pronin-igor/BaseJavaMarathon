package day8;

public class Task1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String string = "0";
        for (int i = 0; i < 2000; i++) {
            string = string + " " + i;
        }
        // System.out.println(string);
        long endTime = System.currentTimeMillis();
        System.out.println("time:" + (endTime - startTime));

        long startTime2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("0");
        for (int i = 0; i < 2000; i++) {
            sb.append(" " + i);
        }
        // System.out.println(sb.toString());
        long endTime2 = System.currentTimeMillis();
        System.out.println("time:" + (endTime2 - startTime2));
    }
}
