package BaekJoon;

import java.util.Scanner;

public class BaekJoon_2851 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int temp = sc.nextInt();
            sum += temp;
            if (sum > 100) {
                int X = sum - 100;
                int Y = 100 - (sum - temp);
                if (Y < X) sum -= temp;
                break;
            }
        }
        System.out.println(sum);
    }
}
