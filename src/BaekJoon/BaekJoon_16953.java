package BaekJoon;

import java.util.*;

public class BaekJoon_16953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        Queue<Long> queue = new LinkedList<>();
        Map<Long, Integer> visited = new HashMap<>();
        queue.add(A);
        visited.put(A, 1);
        while (!queue.isEmpty()) {
            if (visited.containsKey(B)) {
                break;
            }
            long now = queue.poll();
            long next1 = now * 2;
            long next2 = now * 10 + 1;
            if (next1 <= B && !visited.containsKey(next1)) {
                visited.put(next1, visited.get(now) + 1);
                queue.add(next1);
            }
            if (next2 <= B && !visited.containsKey(next2)) {
                visited.put(next2, visited.get(now) + 1);
                queue.add(next2);
            }
        }
        if (!visited.containsKey(B)) {
            System.out.println(-1);
        } else {
            System.out.println(visited.get(B));
        }
    }
}
