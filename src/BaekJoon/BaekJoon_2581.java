package BaekJoon;

import java.util.Scanner;

public class BaekJoon_2581 {
    public static void main(String[] args) {
        int A[] = new int[10001];
        for (int i = 2; i < 10001; i++) {
            A[i] = i;
        }

        for (int i = 2; i < Math.sqrt(10000); i++) {
            if (A[i] == i) {
                for (int j = i + i; j < 10001; j = j + i) {
                    A[j] = 0;
                }
            }
        }

        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        int sum = 0;
        int min = 0;
        for (int i = N; i >= M; i--) {
            sum += A[i];
            if (A[i] != 0) {
                min = A[i];
            }
        }
        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
