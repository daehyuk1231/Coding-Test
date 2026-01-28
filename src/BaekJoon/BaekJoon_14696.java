package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon_14696 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int t = 0; t < N; t++) {
            StringTokenizer st_A = new StringTokenizer(br.readLine());
            int aSize = Integer.parseInt(st_A.nextToken());
            int[] A = new int[aSize];
            for (int i = 0; i < aSize; i++) {
                A[i] = Integer.parseInt(st_A.nextToken());
            }

            StringTokenizer st_B = new StringTokenizer(br.readLine());
            int bSize = Integer.parseInt(st_B.nextToken());
            int[] B = new int[bSize];
            for (int i = 0; i < bSize; i++) {
                B[i] = Integer.parseInt(st_B.nextToken());
            }

            Arrays.sort(A);
            Arrays.sort(B);

            boolean check = false;
            for (int i = 1; aSize - i >= 0 && bSize - i >= 0; i++) {
                if (A[aSize - i] > B[bSize - i]) {
                    System.out.println("A");
                    check = true;
                    break;
                } else if (A[aSize - i] < B[bSize - i]) {
                    System.out.println("B");
                    check = true;
                    break;
                }
            }

            if (!check) {
                if (aSize > bSize) {
                    System.out.println("A");
                } else if (bSize > aSize) {
                    System.out.println("B");
                } else {
                    System.out.println("D");
                }
            }
        }
    }
}
