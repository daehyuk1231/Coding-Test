package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BaekJoon_1326 {
    static boolean[] V;
    static int[] C;
    static int[] B;
    static int S;
    static int E;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        V = new boolean[N];
        C = new int[N];
        B = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            B[i] = Integer.parseInt(st.nextToken());
            C[i] = -1;
        }
        st = new StringTokenizer(br.readLine());
        S = Integer.parseInt(st.nextToken()) - 1;
        E = Integer.parseInt(st.nextToken()) - 1;
        BFS(S);
        System.out.println(C[E]);
    }

    private static void BFS(int s) {
        C[s] = 0;
        V[s] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(s);
        while (!queue.isEmpty()) {
            int now = queue.poll();
            for (int i = now + B[now]; i < N; i += B[now]) {
                if (!V[i]) {
                    V[i] = true;
                    C[i] = C[now] + 1;
                    queue.offer(i);
                }
            }
            for (int i = now - B[now]; i >= 0; i -= B[now]) {
                if (!V[i]) {
                    V[i] = true;
                    C[i] = C[now] + 1;
                    queue.offer(i);
                }
            }
        }
    }
}
