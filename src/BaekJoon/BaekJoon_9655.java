package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_9655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] D = new int[1001];

        D[1] = 1;
        D[2] = 0;
        D[3] = 1;

        for (int i = 4; i <= N; i++) {
            if (D[i - 1] == 1 || D[i - 3] == 1) {
                D[i] = 0;
            } else {
                D[i] = 1;
            }
        }

        if (D[N] == 1) {
            System.out.println("SK");
        } else {
            System.out.println("CY");
        }
    }
}
