package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BaekJoon_2161 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        Queue<Integer> myarr = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            myarr.add(i);
        }

        while (!myarr.isEmpty()) {
            int first = myarr.poll();
            System.out.print(first + " ");
            if (!myarr.isEmpty()) {
                first = myarr.poll();
                myarr.add(first);
            }
        }
    }
}
