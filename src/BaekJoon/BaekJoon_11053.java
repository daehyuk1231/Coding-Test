package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_11053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] D = new int[N];
        Arrays.fill(D, 1);
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (A[j] < A[i] && D[j] >= D[i]) {
                    D[i] = D[j] + 1;
                }
            }
        }
        int max = -1;
        for (int i = 0; i < N; i++) {
            if (max < D[i]) {
                max = D[i];
            }
        }
        System.out.println(max);
    }
}
