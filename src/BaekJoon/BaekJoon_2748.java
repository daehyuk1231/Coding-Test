package BaekJoon;

import java.util.Scanner;

public class BaekJoon_2748 {
    public static void main(String[] args) {
        long F[] = new long[91];
        F[0] = 0;
        F[1] = 1;
        for (int i = 2; i <= 90; i++) {
            F[i] = F[i - 1] + F[i - 2];
        }

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(F[n]);
    }
}
