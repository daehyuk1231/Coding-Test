package BaekJoon;

import java.util.Scanner;

public class BaekJoon_2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if (B > A) {
            int temp = A;
            A = B;
            B = temp;
        }
        int gcd = gcd(A, B);
        System.out.println(gcd);
        System.out.println(gcd * A / gcd * B / gcd);
    }

    private static int gcd(int a, int b) {
        if (a % b != 0) {
            return gcd(b, a % b);
        } else {
            return b;
        }
    }
}
