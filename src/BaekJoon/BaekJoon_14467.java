package BaekJoon;

import java.util.Scanner;

public class BaekJoon_14467 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        int count = 0;
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            int s = sc.nextInt();
            if (A[num] != -1 && A[num] != s) {
                count++;
            }
            A[num] = s;
        }
        System.out.println(count);
    }
}
