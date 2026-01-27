package BaekJoon;

import java.util.Scanner;

public class BaekJoon_2775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[][] people = new int[15][15];

        for (int i = 1; i <= 14; i++) {
            people[0][i] = i;
        }

        for (int k = 1; k <= 14; k++) {
            for (int n = 1; n <= 14; n++) {
                if (n == 1) people[k][n] = 1;
                else people[k][n] = people[k][n - 1] + people[k - 1][n];
            }
        }

        while(T-- > 0) {
            int k = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(people[k][n]);
        }
    }
}
