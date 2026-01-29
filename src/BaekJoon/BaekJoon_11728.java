package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

public class BaekJoon_11728 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] A = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        int[] B = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        int pointer_A = 0;
        int pointer_B = 0;
        while (pointer_A < N && pointer_B < M) {
            if (A[pointer_A] > B[pointer_B]) {
                bw.write(B[pointer_B] + " ");
                pointer_B++;
            } else {
                bw.write(A[pointer_A] + " ");
                pointer_A++;
            }
        }

        if (pointer_A == N) {
            for (int i = pointer_B;i<M;i++){
                bw.write(B[i] + " ");
            }
        }

        if (pointer_B == M) {
            for (int i = pointer_A;i<N;i++){
                bw.write(A[i] + " ");
            }
        }
        bw.flush();
    }
}
