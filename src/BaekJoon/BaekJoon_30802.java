package BaekJoon;

import java.util.Scanner;

public class BaekJoon_30802 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] sizes = new int[6];
        for (int i = 0; i < 6; i++) {
            sizes[i] = sc.nextInt();
        }
        int T = sc.nextInt();
        int P = sc.nextInt();

        int sum = 0;
        for (int i = 0; i < 6; i++) {
            sum += (sizes[i] + T - 1) / T;
        }

        System.out.println(sum);
        System.out.println(N / P + " " + N % P);
    }
}
