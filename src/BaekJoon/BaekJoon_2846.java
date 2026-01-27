package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_2846 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        int Max = 0;
        int temp = 0;
        for (int i = 1; i < n; i++) {
            if (A[i] > A[i - 1]) {
                temp += A[i] - A[i - 1];
                if (Max < temp) Max = temp;
            } else temp = 0;
        }
        System.out.println(Max);
    }
}
