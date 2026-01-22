package BaekJoon;

import java.util.Scanner;

public class BaekJoon_10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] B = new int[N + 1];
        for (int t = 0; t < M; t++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();
            for (int index = i; index <= j; index++) {
                B[index] = k;
            }
        }
        for (int i = 1; i <= N; i++) {
            System.out.print(B[i] + " ");
        }
    }
}
