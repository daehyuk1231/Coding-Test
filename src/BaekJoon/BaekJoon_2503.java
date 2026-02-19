package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BaekJoon_2503 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Question> questions = new ArrayList<>();
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int V = Integer.parseInt(st.nextToken());
            int S = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            questions.add(new Question(V, S, B));
        }
        int answer = 0;
        for (int t = 123; t <= 987; t++) {
            if (notValid(t)) continue;
            boolean checkAnswer = true;
            for (int i = 0; i < N; i++) {
                Question now = questions.get(i);
                char[] temp = Integer.toString(t).toCharArray();
                char[] quiz = Integer.toString(now.V).toCharArray();
                int S = 0;
                int B = 0;
                for (int j = 0; j < 3; j++) {
                    for (int k = 0; k < 3; k++) {
                        if (temp[j] == quiz[k]) {
                            if (j == k) S++;
                            else B++;
                        }
                    }
                }
                if (S != now.S || B != now.B) {
                    checkAnswer = false;
                    break;
                }
            }
            if (checkAnswer) answer++;
        }
        System.out.println(answer);
    }

    private static boolean notValid(int i) {
        char[] temp = Integer.toString(i).toCharArray();
        if (temp[0] == '0' || temp[1] == '0' || temp[2] == '0') {
            return true;
        }
        if (temp[0] == temp[1] || temp[1] == temp[2] || temp[2] == temp[0]) {
            return true;
        }
        return false;
    }

    static class Question {
        int V;
        int S;
        int B;

        public Question(int v, int s, int b) {
            V = v;
            S = s;
            B = b;
        }
    }
}
