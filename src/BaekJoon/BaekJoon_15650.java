package BaekJoon;

import java.util.Scanner;

public class BaekJoon_15650 {
    static int N;
    static int M;
    static int[] S;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        S = new int[M];
        backtracking(0, 0);
    }

    private static void backtracking(int now, int length) {
        if (length == M) {
            for (int i = 0; i < M; i++) {
                System.out.print(S[i] + " ");
            }
            System.out.println();
            return;
        }
        for (int i = now + 1; i <= N; i++) {
            S[length] = i;
            backtracking(i, length + 1);
        }
    }
}