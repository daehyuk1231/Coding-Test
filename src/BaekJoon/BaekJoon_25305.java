package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_25305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) A[i] = sc.nextInt();
        Arrays.sort(A);
        System.out.println(A[A.length - k]);
    }
}
