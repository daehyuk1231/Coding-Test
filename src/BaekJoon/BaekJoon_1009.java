package BaekJoon;

import java.util.Scanner;

public class BaekJoon_1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int result = a % 10;
            for (int j = 0; j < b - 1; j++) {
                result = (result * a) % 10;
            }

            if (result == 0) {
                System.out.println(10);
            } else {
                System.out.println(result);
            }
        }
    }
}
