package BaekJoon;

import java.util.Scanner;

public class BaekJoon_7568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] D = new int[N][2];
        int[] S = new int[N];
        for (int i = 0; i < N; i++) {
            D[i][0] = sc.nextInt();
            D[i][1] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            int now_m = D[i][0];
            int now_h = D[i][1];
            int count = 1;
            for (int j = 0; j < N; j++) {
                if (i != j && now_m < D[j][0] && now_h < D[j][1]) {
                    count++;
                }
            }
            S[i] = count;
        }

        for (int i = 0; i < N; i++) {
            System.out.print(S[i] + " ");
        }
    }
}
