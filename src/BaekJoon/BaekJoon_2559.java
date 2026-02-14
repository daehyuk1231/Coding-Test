package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_2559 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] A = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        int Max = 0;
        for (int i = 0; i < K; i++) {
            Max += A[i];
        }
        int Sum = Max;
        for (int i = K; i < N; i++) {
            Sum -= A[i - K];
            Sum += A[i];
            if (Max < Sum) Max = Sum;
        }
        System.out.println(Max);
    }
}
