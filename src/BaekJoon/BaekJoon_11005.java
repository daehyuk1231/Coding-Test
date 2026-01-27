package BaekJoon;

import java.util.Scanner;

public class BaekJoon_11005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int B = sc.nextInt();

        if (N < B) {
            if (N > 9) {
                System.out.println((char) (N + 55));
            } else {
                System.out.println(N);
            }
        } else {
            int cnt = 0;
            double temp = B;
            while (N > temp) {
                temp = Math.pow(B, ++cnt);
            }

            while (cnt > 0) {
                temp = Math.pow(B, --cnt);
                int now = (int) (N / temp);
                if (now > 9) {
                    System.out.print((char) (now + 55));
                } else {
                    System.out.print(now);
                }
                N = (int) (N % temp);
            }
        }
    }
}
