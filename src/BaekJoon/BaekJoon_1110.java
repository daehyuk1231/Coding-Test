package BaekJoon;

import java.util.Scanner;

public class BaekJoon_1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Ori = sc.nextInt();
        int Next = Ori;
        int count = 1;
        while (true) {
            int first, second;
            if (Next < 10) {
                first = 0;
                second = Next;
            } else {
                first = Next / 10;
                second = Next % 10;
            }
            int sum = first + second;
            Next = (Next % 10 * 10) + (sum % 10);
            if (Ori == Next) break;
            else count++;
        }
        System.out.println(count);
    }
}
