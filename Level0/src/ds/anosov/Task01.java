package ds.anosov;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = scan.nextInt();

        int[] ar = new int[10];

        for (int i = 0; i < ar.length; i++) {

            if(a % 2 == 0) {
                ar[i] = (2 * i + 1) + a; //если ввели четное
            }
            if(a % 2 != 0) {
                ar[i] = (2 * i + 2) + a; //если ввели нечетное
            }
            System.out.print(ar[i] + "; " );
        }
    }

}
