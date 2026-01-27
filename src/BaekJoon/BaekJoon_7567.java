package BaekJoon;

import java.util.Scanner;

public class BaekJoon_7567 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] A = sc.nextLine().toCharArray();
        int sum = 10;
        char before = A[0];

        for (int i = 1; i < A.length; i++) {
            char now = A[i];
            if (before == now) sum += 5;
            else sum += 10;
            before = now;
        }
        System.out.println(sum);
    }
}
