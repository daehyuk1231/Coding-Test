package BaekJoon;

import java.util.Scanner;

public class BaekJoon_2501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int count = 0;
        int result = 0;
        boolean find = false;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) count++;
            if (K == count) {
                find = true;
                result = i;
                break;
            }
        }
        if (find) System.out.println(result);
        else System.out.println(0);
    }
}
