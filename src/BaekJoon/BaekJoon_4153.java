package BaekJoon;

import java.util.Scanner;

public class BaekJoon_4153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            if (A == 0 && B == 0 && C == 0) break;
            boolean result = false;
            if (B < A && C < A) {
                if (A * A == B * B + C * C) result = true;
            } else if (A < B && C < B) {
                if (B * B == A * A + C * C) result = true;
            } else {
                if (C * C == A * A + B * B) result = true;
            }

            if (result) System.out.println("right");
            else System.out.println("wrong");
        }
    }
}
