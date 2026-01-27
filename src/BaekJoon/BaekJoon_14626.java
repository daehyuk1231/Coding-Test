package BaekJoon;

import java.util.Scanner;

public class BaekJoon_14626 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] isbn = sc.next().toCharArray();

        int star = -1;
        int sum = 0;

        for (int i = 0; i < 13; i++) {
            if (isbn[i] == '*') {
                star = i;
                continue;
            }

            int digit = isbn[i] - '0';
            if (i % 2 == 0) {
                sum += digit;
            } else {
                sum += digit * 3;
            }
        }

        int weight = (star % 2 == 0) ? 1 : 3;

        for (int x = 0; x <= 9; x++) {
            if ((sum + weight * x) % 10 == 0) {
                System.out.println(x);
                return;
            }
        }
    }
}
