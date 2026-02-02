package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJoon_10610 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] N = br.readLine().toCharArray();
        int[] A = new int[N.length];
        for (int i = 0; i < A.length; i++) {
            A[i] = Integer.parseInt(String.valueOf(N[i]));
        }
        Arrays.sort(A);
        if (A[0] != 0) {
            System.out.println(-1);
        } else {
            int sum = 0;
            for (int i = 0; i < A.length; i++) {
                sum += A[i];
            }
            if (sum % 3 != 0) {
                System.out.println(-1);
            } else {
                for (int i = A.length - 1; i >= 0; i--) {
                    System.out.print(A[i]);
                }
            }
        }
    }
}
