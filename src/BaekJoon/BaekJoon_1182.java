package BaekJoon;

import java.util.Scanner;

public class BaekJoon_1182 {
    static int N;
    static int S;
    static int[] A;
    static int count;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        S = sc.nextInt();
        A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        count = 0;
        backtracking(0, 0, 0);
        System.out.println(count);
    }

    private static void backtracking(int index, int sum, int su) {
        if (index == N) {
            if (sum == S && su > 0) {
                count++;
            }
            return;
        }
        backtracking(index + 1, sum + A[index], su + 1);
        backtracking(index + 1, sum, su);
    }
}
