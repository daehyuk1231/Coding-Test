package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_9848 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int prev = Integer.parseInt(br.readLine());
        int gifts = 0;

        for (int i = 1; i < n; i++) {
            int curr = Integer.parseInt(br.readLine());

            if (prev - curr >= k) {
                gifts++;
            }

            prev = curr;
        }

        System.out.println(gifts);
    }
}

