package BaekJoon;

import java.util.ArrayList;
import java.util.Scanner;

public class BaekJoon_9506 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int N = sc.nextInt();
            if (N == -1) break;
            ArrayList<Integer> temp = new ArrayList<>();
            int sum = 0;
            for (int i = 1; i < N; i++) {
                if (N % i == 0) {
                    temp.add(i);
                    sum += i;
                }
            }
            if (sum == N) {
                System.out.print(N + " = ");
                for (int i = 0; i < temp.size() - 1; i++) {
                    System.out.print(temp.get(i) + " + ");
                }
                System.out.println(temp.get(temp.size() - 1));
            } else {
                System.out.println(N + " is NOT perfect.");
            }
        }
    }
}
