package BaekJoon;

import java.util.Scanner;

public class BaekJoon_2947 {
    static int[] A;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        A = new int[5];
        for (int i = 0; i < 5; i++) {
            A[i] = sc.nextInt();
        }
        for (int t = 0; t < 4; t++) {
            for (int i = 0; i < 4; i++) {
                if (A[i] > A[i + 1]) {
                    int temp = A[i];
                    A[i] = A[i + 1];
                    A[i + 1] = temp;
                    printA();
                }
            }
        }
    }

    private static void printA() {
        for (int i = 0; i < 5; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
}
