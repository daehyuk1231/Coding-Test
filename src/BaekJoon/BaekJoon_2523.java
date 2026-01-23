package BaekJoon;

import java.util.Scanner;

public class BaekJoon_2523 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= 2 * N - 1; i++) {
            for (int j = 0; j < N; j++) {
                if (i <= N && j < i || i > N && j + i < 2 * N) System.out.print("*");
                else break;
            }
            System.out.println();
        }
    }
}
