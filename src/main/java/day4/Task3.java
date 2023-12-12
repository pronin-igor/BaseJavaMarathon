package day4;

public class Task3 {
    public static void main(String[] args) {
        int[][]mas = new int[12][8];
        int maxRow = Integer.MIN_VALUE;
        int maxRowIndex = 0;
        for (int i = 0; i < 12; i++) {
            int rowSum = 0;
            for (int j = 0; j < 8; j++) {
                mas[i][j] = (int) (Math.random() * 50);
                rowSum += mas[i][j];
                System.out.print(mas[i][j] + " ");
            }
            System.out.print("cумма - " + rowSum);
            System.out.println();

            if (rowSum > maxRow) {
                maxRow = rowSum;
                maxRowIndex = i;
            }
        }
        System.out.println(maxRowIndex);
    }
}
