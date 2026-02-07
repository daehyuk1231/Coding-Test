package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BaekJoon_1015 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Node1015> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(new Node1015(Integer.parseInt(st.nextToken()), i));
        }
        A.sort((o1, o2) -> o1.V - o2.V);
        int[] P = new int[N];
        for (int i = 0; i < N; i++) {
            P[A.get(i).index] = i;
        }

        for (int i = 0; i < N; i++) {
            System.out.print(P[i] + " ");
        }
    }

    static class Node1015 {
        int V;
        int index;

        public Node1015(int v, int index) {
            V = v;
            this.index = index;
        }
    }
}
