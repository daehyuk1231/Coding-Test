package BaekJoon;

import java.util.Scanner;

public class BackJoon_10952_AB5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            if(A==0 && B==0) break;
            System.out.println(A+B);
        }
    }
}
