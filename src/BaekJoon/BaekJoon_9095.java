package BaekJoon;

import java.util.Scanner;

public class BaekJoon_9095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] D = new int[11][11];
        D[1][1] = 1;
        D[1][2] = 1;
        D[1][3] = 1;
        for (int i = 2; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                D[i][j] += D[i - 1][j - 1];
                if (j > 1) D[i][j] += D[i - 1][j - 2];
                if (j > 2) D[i][j] += D[i - 1][j - 3];
            }
        }
        int[] S = new int[11];
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                S[i] += D[j][i];
            }
        }
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            System.out.println(S[N]);
        }
    }
}
