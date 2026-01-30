package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BaekJoon_2822 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Score> myarr = new ArrayList<>();

        for (int i = 1; i <= 8; i++) {
            myarr.add(new Score(i, Integer.parseInt(br.readLine())));
        }
        Collections.sort(myarr);
        int[] result = new int[5];
        int total_score = 0;
        for (int i = 0; i < 5; i++) {
            Score now = myarr.get(i);
            total_score += now.value;
            result[i] = now.num;
        }
        System.out.println(total_score);
        Arrays.sort(result);
        for (int now : result) {
            System.out.print(now + " ");
        }
    }

    static class Score implements Comparable<Score> {
        int num;
        int value;

        public Score(int num, int value) {
            this.num = num;
            this.value = value;
        }

        @Override
        public int compareTo(Score o) {
            return o.value - this.value;
        }
    }
}
