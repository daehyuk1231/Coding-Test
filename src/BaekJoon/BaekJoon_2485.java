package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJoon_2485 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int[] B = new int[N - 1];
        A[0] = Integer.parseInt(br.readLine());
        for (int i = 1; i < N; i++) {
            A[i] = Integer.parseInt(br.readLine());
            B[i - 1] = A[i] - A[i - 1];
        }
        Arrays.sort(B);
        int gcdV = gcd(B[1], B[0]);
        for (int i = 2; i < N - 1; i++) {
            if (gcdV > B[i]) {
                int temp = gcdV;
                gcdV = B[i];
                B[i] = temp;
            }
            gcdV = gcd(B[i], gcdV);
        }
        int index = 0;
        int count = 0;
        for (int i = A[0]; i < A[N - 1]; i += gcdV) {
            if (i < A[index]) count++;
            else if (i == A[index]) index++;
        }
        System.out.println(count);
    }

    private static int gcd(int a, int b) {
        if (a % b == 0) return b;
        else return gcd(b, a % b);
    }
}
