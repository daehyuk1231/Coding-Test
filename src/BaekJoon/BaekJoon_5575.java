package BaekJoon;

import java.util.Scanner;

public class BaekJoon_5575 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int Sh = sc.nextInt();
            int Sm = sc.nextInt();
            int Ss = sc.nextInt();
            int Eh = sc.nextInt();
            int Em = sc.nextInt();
            int Es = sc.nextInt();

            if (Ss > Es) {
                Es += 60;
                Em--;
            }
            Es -= Ss;

            if (Sm > Em) {
                Em += 60;
                Eh--;
            }
            Em -= Sm;
            Eh -= Sh;

            System.out.println(Eh + " " + Em + " " + Es);
        }
    }
}
