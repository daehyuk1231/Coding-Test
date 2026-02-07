package BaekJoon;

import java.io.*;
import java.util.*;

public class BaekJoon_2776 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {

            int N = Integer.parseInt(br.readLine());
            int[] A = new int[N];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) A[i] = Integer.parseInt(st.nextToken());

            Arrays.sort(A);

            int M = Integer.parseInt(br.readLine());
            int[][] B = new int[M][2];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < M; i++) {
                B[i][0] = Integer.parseInt(st.nextToken());
                B[i][1] = i;
            }

            Arrays.sort(B, (o1, o2) -> Integer.compare(o1[0], o2[0]));

            int[] answer = new int[M];

            int a = 0, b = 0;

            while (a < N && b < M) {

                if (A[a] == B[b][0]) {

                    int target = B[b][0];

                    while (b < M && B[b][0] == target) {
                        answer[B[b][1]] = 1;
                        b++;
                    }

                } else if (A[a] < B[b][0]) {
                    a++;
                } else {
                    answer[B[b][1]] = 0;
                    b++;
                }
            }

            while (b < M) {
                answer[B[b][1]] = 0;
                b++;
            }

            for (int i = 0; i < M; i++) {
                sb.append(answer[i]).append('\n');
            }
        }

        System.out.print(sb);
    }
}
