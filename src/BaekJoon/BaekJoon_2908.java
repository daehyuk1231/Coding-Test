package BaekJoon;

import java.util.Scanner;

public class BaekJoon_2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] A = sc.next().toCharArray();
        char[] B = sc.next().toCharArray();

        char temp = A[0];
        A[0] = A[2];
        A[2] = temp;

        temp = B[0];
        B[0] = B[2];
        B[2] = temp;

        int reA = Integer.parseInt(new String(A));
        int reB = Integer.parseInt(new String(B));
        System.out.println(Math.max(reA, reB));
    }
}
