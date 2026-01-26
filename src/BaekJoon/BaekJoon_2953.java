package BaekJoon;

import java.util.Scanner;

public class BaekJoon_2953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MAX = Integer.MIN_VALUE;
        int MAX_NUM = Integer.MIN_VALUE;
        for (int i = 1; i <= 5; i++) {
            int temp_sum = 0;
            for (int j = 0; j < 4; j++) {
                temp_sum += sc.nextInt();
            }
            if (MAX < temp_sum) {
                MAX = temp_sum;
                MAX_NUM = i;
            }
        }
        System.out.println(MAX_NUM + " " + MAX);
    }
}
