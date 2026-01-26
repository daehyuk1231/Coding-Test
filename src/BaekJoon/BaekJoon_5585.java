package BaekJoon;

import java.util.Scanner;

public class BaekJoon_5585 {
    public static void main(String[] args) {
        int[] A = {500, 100, 50, 10, 5, 1};
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int S = 1000 - N;
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            count += S / A[i];
            S = S % A[i];
        }
        System.out.println(count);
    }
}
