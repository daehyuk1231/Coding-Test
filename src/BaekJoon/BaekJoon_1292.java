package BaekJoon;

import java.util.Scanner;

public class BaekJoon_1292 {
    public static void main(String[] args) {

        int T[] = new int[1001];

        int index = 1;
        for (int i = 1; index < 1001; i++) {
            for (int j = 0; j < i && index < 1001; j++) {
                T[index++] = i;
            }
        }

        int S[] = new int[1001];
        for (int i = 1; i < 1001; i++) {
            S[i] = S[i - 1] + T[i];
        }

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(S[B] - S[A - 1]);
    }
}
