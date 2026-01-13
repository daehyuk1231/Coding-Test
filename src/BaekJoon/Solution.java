package BaekJoon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 자바 문법으로 답안 작성
 * 함수 인자와 반환 값은 문제에 따라 적절하게 수정하여 제출
 */
public class Solution
{
    // 두 트리에서 부모 경로가 다른 노드 찾는 함수
    public List<Integer> solution(int n, int[][] originalEdges, int[][] compareEdges)
    {
        int[] originalParent = buildParent(originalEdges, n);
        int[] compareParent = buildParent(compareEdges, n);

        Map<Integer, List<Integer>> originalNodePaths = new HashMap<>();
        Map<Integer, List<Integer>> compareNodePaths = new HashMap<>();

        List<Integer> result = new ArrayList<>();

        // 각 노드의 루트 경로 비교
        for (int id = 1; id <= n; id++) {
            List<Integer> path1 = buildPath(id, originalParent, originalNodePaths);
            List<Integer> path2 = buildPath(id, compareParent, compareNodePaths);

            if (!path1.equals(path2)) {
                result.add(id);
            }
        }

        return result;
    }

    // 부모 배열 생성
    private int[] buildParent(int[][] edges, int n)
    {
        int[] parent = new int[n + 1];

        for (int[] edge : edges) {
            parent[edge[1]] = edge[0];
        }

        return parent;
    }

    // 루트부터 해당 노드의 경로 생성
    private List<Integer> buildPath(int id, int[] parent, Map<Integer, List<Integer>> nodePaths)
    {
        if (nodePaths.containsKey(id)) {
            return nodePaths.get(id);
        }

        if (parent[id] == 0) {
            List<Integer> path = new ArrayList<>();
            path.add(id);
            nodePaths.put(id, path);
            return path;
        }

        List<Integer> path = new ArrayList<>(buildPath(parent[id], parent, nodePaths));
        path.add(id);
        nodePaths.put(id, path);

        return path;
    }

    public static void main(String[] args)
    {
        Solution sol = new Solution();

        int n = 6;

        int[][] originalEdges = {
                {1, 2},
                {1, 3},
                {3, 4},
                {3, 5},
                {3, 6}
        };

        int[][] compareEdges = {
                {1, 2},
                {1, 5},
                {2, 3},
                {3, 4},
                {5, 6}
        };

        System.out.println(sol.solution(n, originalEdges, compareEdges));
    }
}