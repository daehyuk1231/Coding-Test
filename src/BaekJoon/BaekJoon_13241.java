package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_13241 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        if (A < B) {
            long temp = B;
            B = A;
            A = temp;
        }
        long gcd = gcd2(A, B);
        System.out.println(A * B / gcd);
    }

    private static long gcd2(long a, long b) {
        if (a % b == 0) return b;
        return gcd2(b, a % b);
    }
}
