package BaekJoon;

import java.util.Scanner;

public class BaekJoon_1010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int[][] dp = new int[30][30];

        for (int i = 1; i < 30; i++) {
            dp[i][i] = 1;
            dp[1][i] = i;
        }

        for (int n = 2; n < 30; n++) {
            for (int m = n + 1; m < 30; m++) {
                dp[n][m] = dp[n][m - 1] + dp[n - 1][m - 1];
            }
        }

        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            System.out.println(dp[N][M]);
        }

        sc.close();
    }
}
