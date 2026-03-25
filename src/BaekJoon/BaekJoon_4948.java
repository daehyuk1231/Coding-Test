package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_4948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 246912;
        boolean[] isPrime = new boolean[max + 1];

        // 처음에는 2 이상을 모두 소수라고 가정
        for (int i = 2; i <= max; i++) {
            isPrime[i] = true;
        }

        // 에라토스테네스의 체
        for (int i = 2; i * i <= max; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= max; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            int count = 0;
            for (int i = n + 1; i <= 2 * n; i++) {
                if (isPrime[i]) count++;
            }

            sb.append(count).append('\n');
        }

        System.out.print(sb);
    }
}
