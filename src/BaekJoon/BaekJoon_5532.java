package BaekJoon;

import java.util.Scanner;

public class BaekJoon_5532 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int spend_A = A / C;
        if (A % C != 0) spend_A++;
        int spend_B = B / D;
        if (B % D != 0) spend_B++;
        System.out.println(L - Math.max(spend_A, spend_B));
    }
}
