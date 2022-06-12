package Algorithms;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int a = scan.nextInt();
        int[] ar = new int[a];
        int b;
        int nMax = 0;
        int nMin = 0;
        System.out.print("Введите значение, но не больше " + a + ": ");

        for(int i = 0; i < ar.length; i++) {
            b = scan.nextInt();
            ar[i] = b;
        }

        int min = ar[0];
        int max = ar[0];

        for (int i = 1; i < ar.length; i++) {
            if(ar[i] < min){
                min = ar[i];
                nMin = i;
            }
            if (ar[i] > max) {
                max = ar[i];
                nMax = i;
            }
        }

        System.out.println("Минимальное значение: " + min + ". Позиция в массиве: " + nMin);
        System.out.print("Максимальное значение: " + max + ". Позиция в массиве: " + nMax);
    }
}
