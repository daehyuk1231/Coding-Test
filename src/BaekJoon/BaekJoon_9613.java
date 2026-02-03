package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_9613 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int[] M = new int[N];
            for (int i = 0; i < N; i++) {
                M[i] = Integer.parseInt(st.nextToken());
            }
            long sum = 0;
            for (int i = 0; i < N - 1; i++) {
                for (int j = i + 1; j < N; j++) {
                    int a = M[i];
                    int b = M[j];
                    if (a < b) {
                        int temp = a;
                        a = b;
                        b = temp;
                    }
                    sum += gcd(a, b);
                }
            }
            System.out.println(sum);
        }
    }

    private static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        } else {
            return gcd(b, a % b);
        }
    }
}
