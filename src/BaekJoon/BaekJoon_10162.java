package BaekJoon;

import java.util.Scanner;

public class BaekJoon_10162 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        if (T % 10 != 0) {
            System.out.println(-1);
        } else {
            int A = T / 300;
            int B = T / 60;
            int C = T / 10;
            System.out.println(A + " " + B + " " + C);
        }
    }
}
