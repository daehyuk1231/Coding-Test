package BaekJoon;

import java.util.ArrayList;
import java.util.Scanner;

public class BaekJoon_2526 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int P = sc.nextInt();
        int temp = N;

        ArrayList<Integer> myarr = new ArrayList<>();
        myarr.add(N);
        int mySize = 0;
        while (true) {
            temp = (temp * N) % P;
            if (myarr.contains(temp)) {
                for (int i = 0; i < myarr.size(); i++) {
                    if (myarr.get(i) == temp) {
                        mySize = myarr.size() - i;
                        break;
                    }
                }
                break;
            } else {
                myarr.add(temp);
            }
        }
        System.out.println(mySize);
    }
}
