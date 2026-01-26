package BaekJoon;

import java.util.Scanner;

public class BaekJoon_1712 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();

        if (B >= C) System.out.println(-1);
        else {
            int count = 1;
            while (true) {
                if (A + B * count < C * count) {
                    break;
                } else {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
