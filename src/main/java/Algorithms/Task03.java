package Algorithms;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int x = scan.nextInt();
        int[] arr = new int[x];
        int a;
        int nMin = 0;
        int nMax = 0;

        System.out.print("Введите не больше " + x + " значений: ");
        for (int i = 0; i < arr.length; i++) {
            a = scan.nextInt();
            arr[i] = a;
        }

        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                nMin = i;
            }

            if (arr[i] > max) {
                max = arr[i];
                nMax = i;
            }
        }

        int temp = arr[nMax];
        arr[nMax] = arr[nMin];
        arr[nMin] = temp;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
