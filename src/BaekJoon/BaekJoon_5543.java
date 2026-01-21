package BaekJoon;

import java.util.Scanner;

public class BaekJoon_5543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int min_f = Math.min(A, Math.min(B, C));

        int D = sc.nextInt();
        int F = sc.nextInt();
        int min_s = Math.min(D, F);

        System.out.println(min_f + min_s - 50);
    }
}
