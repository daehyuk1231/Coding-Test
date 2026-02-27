package BaekJoon;

import java.util.Scanner;

public class BaekJoon_10157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        int R = sc.nextInt();
        int K = sc.nextInt();
        int X = 1;
        int Y = 1;

        if (C * R < K) {
            System.out.println(0);
            return;
        }

        while ((C + R) * 2 - 4 < K) {
            X++;
            Y++;
            K -= (C + R) * 2 - 4;
            C -= 2;
            R -= 2;
        }
        if (K <= R) {
            Y += K - 1;
        } else if (K <= R + C - 1) {
            Y += R - 1;
            K -= R;
            X += K;
        } else if (K <= R * 2 + C - 2) {
            X += C - 1;
            K -= R + C - 1;
            Y += R - 1 - K;
        } else {
            K -= R * 2 + C - 2;
            X += C - 1 - K;
        }

        System.out.println(X + " " + Y);
    }
}
