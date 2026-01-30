package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BaekJoon_10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);

        int M = Integer.parseInt(br.readLine());
        ArrayList<MyArr> B = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int index = i;
            int value = Integer.parseInt(st.nextToken());
            B.add(new MyArr(index, value));
        }
        B.sort(Comparator.comparingInt(o -> o.value));

        int[] answer = new int[M];
        int start_index = 0;
        for (int i = 0; i < B.size() && start_index < A.length; ) {
            if (A[start_index] > B.get(i).value) {
                answer[B.get(i).index] = 0;
                i++;
            } else if (A[start_index] == B.get(i).value) {
                answer[B.get(i).index] = 1;
                i++;
                start_index++;
            } else {
                start_index++;
            }
        }
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
    }

    static class MyArr {
        int index;
        int value;

        public MyArr(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }

}

