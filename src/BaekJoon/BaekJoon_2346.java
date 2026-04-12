package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BaekJoon_2346 {
    static class Balloon {
        int idx;
        int move;

        Balloon(int idx, int move) {
            this.idx = idx;
            this.move = move;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Deque<Balloon> deque = new ArrayDeque<>();

        for (int i = 1; i <= N; i++) {
            int move = Integer.parseInt(st.nextToken());
            deque.offerLast(new Balloon(i, move));
        }

        StringBuilder sb = new StringBuilder();

        while (!deque.isEmpty()) {
            Balloon current = deque.pollFirst();
            sb.append(current.idx).append(" ");

            if (deque.isEmpty()) break;

            int move = current.move;

            if (move > 0) {
                for (int i = 0; i < move - 1; i++) {
                    deque.offerLast(deque.pollFirst());
                }
            } else {
                for (int i = 0; i < -move; i++) {
                    deque.offerFirst(deque.pollLast());
                }
            }
        }

        System.out.println(sb.toString().trim());
    }
}
