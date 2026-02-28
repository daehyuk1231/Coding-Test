package BaekJoon;

import java.util.Scanner;

public class BaekJoon_1012 {
    static int M;
    static int N;
    static int[][] B;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            M = sc.nextInt();
            N = sc.nextInt();
            B = new int[M][N];
            int K = sc.nextInt();
            for (int i = 0; i < K; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                B[x][y] = 1;
            }
            int count = 0;
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    if (B[i][j] == 1) {
                        count++;
                        DFS(i, j);
                    }
                }
            }
            System.out.println(count);
        }
    }

    private static void DFS(int i, int j) {
        B[i][j] = 0;
        if (i - 1 >= 0 && B[i - 1][j] == 1) DFS(i - 1, j);
        if (i + 1 < M && B[i + 1][j] == 1) DFS(i + 1, j);
        if (j - 1 >= 0 && B[i][j - 1] == 1) DFS(i, j - 1);
        if (j + 1 < N && B[i][j + 1] == 1) DFS(i, j + 1);
    }
}
