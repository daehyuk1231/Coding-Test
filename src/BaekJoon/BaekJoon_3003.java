package BaekJoon;

import java.util.Scanner;

public class BaekJoon_3003 {
    public static void main(String[] args) {
        int A[] = {1, 1, 2, 2, 2, 8};
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<6; i++) {
            int temp = sc.nextInt();
            int result = A[i] - temp;
            System.out.print(result + " ");
        }
    }
}
