package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJoon_2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] C = new int[8001];
        int[] A = new int[N];

        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(br.readLine());

            C[temp + 4000]++;

            sum += temp;
            A[i] = temp;

            if (min > temp) {
                min = temp;
            }
            if (max < temp) {
                max = temp;
            }
        }
        System.out.println(Math.round((double) sum / (double) N));

        Arrays.sort(A);
        System.out.println(A[N / 2]);

        int countMax = 0;
        int countV = 0;
        boolean first = true;
        for (int i = 0; i <= 8000; i++) {
            if (C[i] > countMax) {
                countMax = C[i];
                countV = i;
                first = true;
            } else if (C[i] == countMax && first) {
                countV = i;
                first = false;
            }
        }
        System.out.println(countV - 4000);

        System.out.println(max - min);
    }
}
