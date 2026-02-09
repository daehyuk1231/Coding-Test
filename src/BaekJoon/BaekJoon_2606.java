package BaekJoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon_2606 {
    static int N, M;
    static boolean[] V;
    static int[][] B;
    static int count;
    static Queue<Integer> queue;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        B = new int[N + 1][N + 1];
        V = new boolean[N + 1];
        for (int i = 0; i < M; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            B[s][e] = 1;
            B[e][s] = 1;
        }
        queue = new LinkedList<>();
        queue.add(1);
        V[1] = true;
        count = 0;
        BFS();
        System.out.println(count);
    }

    private static void BFS() {
        while (!queue.isEmpty()) {
            int now = queue.poll();
            for (int i = 1; i <= N; i++) {
                if (B[now][i] == 1 && !V[i]) {
                    queue.add(i);
                    V[i] = true;
                    count++;
                }
            }
        }
    }
}
