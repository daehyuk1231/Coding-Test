package BaekJoon;

import java.util.Scanner;

public class BaekJoon_17388 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int K = sc.nextInt();
        int H = sc.nextInt();

        if (S + K + H >= 100) {
            System.out.println("OK");
        } else if (S < H && S < K) {
            System.out.println("Soongsil");
        } else if (H < S && H < K) {
            System.out.println("Hanyang");
        } else {
            System.out.println("Korea");
        }
    }
}
