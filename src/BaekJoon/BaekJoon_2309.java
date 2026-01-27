package BaekJoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_2309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P[] = new int[9];
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            P[i] = sc.nextInt();
            sum += P[i];
        }

        Arrays.sort(P);
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - P[i] - P[j] == 100) {
                    for (int k = 0; k < 9; k++) {
                        if (k != i && k != j) {
                            System.out.println(P[k]);
                        }
                    }
                    return;
                }
            }
        }
    }
}
