package BaekJoon;

import java.util.Scanner;

public class BaekJoon_1834 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 0;
        for (int i = 1; i < n; i++) {
            long temp = n * i + i;
            sum += temp;
        }
        System.out.println(sum);
    }
}
