package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BaekJoon_1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        ArrayList<Integer> myarr = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            myarr.add(i);
        }
        int index = K - 1;
        System.out.print("<");
        while (!myarr.isEmpty()) {
            index %= myarr.size();
            if (myarr.size() != 1) {
                System.out.print(myarr.get(index) + ", ");
            } else {
                System.out.println(myarr.get(index) + ">");
            }
            myarr.remove(index);
            index += K - 1;
        }
    }
}
