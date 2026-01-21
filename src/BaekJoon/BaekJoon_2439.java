package BaekJoon;

import java.util.Scanner;

public class BaekJoon_2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = N; i > 0; i--) {
            for (int j = 1; j <= N; j++) {
                if (j >= i) System.out.println("*");
                else System.out.println(" ");
            }
            System.out.println();
        }
    }
}
