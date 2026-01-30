package BaekJoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class BaekJoon_11931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> arr = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(br.readLine());
            arr.add(temp);
        }
        arr.sort(Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            bw.write(arr.get(i) + "\n");
        }
        bw.flush();
    }
}
