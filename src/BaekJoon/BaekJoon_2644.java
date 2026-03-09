package BaekJoon;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon_2644 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer>[] myarr = new ArrayList[N + 1];
        for (int i = 0; i <= N; i++) {
            myarr[i] = new ArrayList<>();
        }
        int A = sc.nextInt();
        int B = sc.nextInt();
        int M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            myarr[s].add(e);
            myarr[e].add(s);
        }
        int[] visited = new int[N + 1];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(A);
        while (!queue.isEmpty()) {
            if (visited[B] != 0) break;
            int now = queue.poll();
            for (int i = 0; i < myarr[now].size(); i++) {
                int next = myarr[now].get(i);
                if (visited[next] == 0) {
                    visited[next] = visited[now] + 1;
                    queue.add(next);
                }
            }
        }
        if (visited[B] == 0) System.out.println(-1);
        else System.out.println(visited[B]);
    }
}
