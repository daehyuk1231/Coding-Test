package BaekJoon;

import java.util.Scanner;

public class BaekJoon_1977 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int sum = 0;
        int min = -1;
        boolean find_min = false;
        for (int i = 1; i * i <= N; i++) {
            int temp = i * i;
            if (temp >= M) {
                if (!find_min) {
                    min = temp;
                    find_min = true;
                }
                sum += temp;
            }
        }
        if (min == -1) {
            System.out.println(min);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
