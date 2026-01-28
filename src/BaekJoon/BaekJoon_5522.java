package BaekJoon;

import java.util.Scanner;

public class BaekJoon_5522 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int temp = sc.nextInt();
            sum += temp;
        }
        System.out.println(sum);
    }
}
