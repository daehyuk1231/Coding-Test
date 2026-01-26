package BaekJoon;

import java.util.Scanner;

public class BaekJoon_2720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int C = sc.nextInt();
            int Q, D, N, P;
            Q = C / 25;
            C %= 25;
            D = C / 10;
            C %= 10;
            N = C / 5;
            C %= 5;
            P = C;
            System.out.println(Q + " " + D + " " + N + " " + P);
        }
    }
}
