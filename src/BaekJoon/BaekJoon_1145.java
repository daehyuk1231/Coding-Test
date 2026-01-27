package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_1145 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[5];
        for (int i = 0; i < 5; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        int start = A[2];
        while (true) {
            int count = 0;
            for (int i = 0; i < 5; i++) {
                if (start % A[i] == 0) count++;
            }
            if (count > 2) break;
            start++;
        }
        System.out.println(start);
    }
}
