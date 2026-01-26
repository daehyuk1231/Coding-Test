package BaekJoon;

import java.util.Scanner;

public class BaekJoon_10991 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i < N+1; i++) {
            for (int j = 0; j < N + i - 1; j++) {
                if ((i + j + N) % 2 == 0 && j >= N - i - 1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
