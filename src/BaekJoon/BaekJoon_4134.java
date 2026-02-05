package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_4134 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            long N = Long.parseLong(br.readLine());
            if (N == 0 || N == 1 || N == 2) {
                System.out.println(2);
            } else {
                System.out.println(checkSosu(N));
            }
        }
    }

    private static long checkSosu(long n) {
        while (true) {
            boolean find = true;
            for (long i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    find = false;
                    break;
                }
            }
            if (find) {
                return n;
            } else n++;
        }
    }
}
