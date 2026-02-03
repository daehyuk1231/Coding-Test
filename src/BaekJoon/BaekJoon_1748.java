package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_1748 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = N;
        int S = 1;
        int sum = 0;
        for (int i = 10; i <= N; i *= 10) {
            sum += (i - (i / 10)) * S++;
            M -= (i - (i / 10));
        }
        sum += M * S;
        System.out.println(sum);
    }
}
