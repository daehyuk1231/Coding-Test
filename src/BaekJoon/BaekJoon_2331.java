package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BaekJoon_2331 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        ArrayList<Integer> myarr = new ArrayList<>();
        myarr.add(A);
        int before = A;
        int now;
        while (true) {
            char[] beforeC = String.valueOf(before).toCharArray();
            now = 0;
            for (int i = 0; i < beforeC.length; i++) {
                int temp = Integer.parseInt(String.valueOf(beforeC[i]));
                now += Math.pow(temp, P);
            }
            if (myarr.contains(now)) {
                break;
            } else {
                myarr.add(now);
                before = now;
            }
        }
        int count = 0;
        for (int i = 0; i < myarr.size(); i++) {
            if (myarr.get(i) == now) {
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}
