package ds.anosov;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Задайте размерность матрицы: ");
        int a = scan.nextInt();
        System.out.print("Задайте размерность матрицы: ");
        int b = scan.nextInt();
        int[][] ar = new int[a][b];
        double avg = 0;

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.println("Введите 1 элемент массива ar[" + i + "][" + j + "]:");
                ar[i][j] = scan.nextInt();
                avg = avg + ar[i][j];
            }
            System.out.println("Среднее арифметическое строки " + (i + 1) + ": " + avg / b);
            avg = 0;
        }

    }
}
