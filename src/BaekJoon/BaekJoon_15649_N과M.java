package BaekJoon;

import java.util.Scanner;

public class BaekJoon_15649_N과M {

    static int N, M;
    static boolean[] V;
    static int[] S;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        S = new int[N];
        V = new boolean[N];
        backtraking(0);
    }

    private static void backtraking(int length) {
        if (length == M) { // 정답인지 확인해서 return;
            // 수열 출력
            printArray();
            return;
        }
        for (int i = 0; i < N; i++) { // 갈수 있는 모든 선택지
            if (!V[i]) {
                V[i] = true;
                S[length] = i;
                backtraking(length + 1);
                V[i] = false;
            }
        }
    }

    private static void printArray() {
        for (int i = 0; i < M; i++) {
            System.out.print(S[i] + 1 + " ");
        }
    }
}
