package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_2847 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(br.readLine());
        }
        int next = A[N - 1];
        int count = 0;
        for (int i = N - 2; i >= 0; i--) {
            int now = A[i];
            if (next <= now) {
                int gep = now - next + 1;
                A[i] -= gep;
                count += gep;
            }
            next = A[i];
        }
        System.out.println(count);
    }
}
