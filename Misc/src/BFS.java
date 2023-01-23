import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {
        int[][] mat = new int[][]{{0, 1, 1, 0, 0}, {1, 0, 0, 1, 0}, {1, 0, 0, 0, 1}, {0, 1, 0, 0, 0}, {0, 0, 1, 0, 0}};
        int[] visited = new int[mat.length];
        Queue<Integer> q = new LinkedList<>();

        int start = 0;
        visited[start] = 1;
        q.add(start);

        while (!q.isEmpty()) {
            int n = q.poll();
            System.out.println(n + "\t");
            for (int i = 0; i < mat.length; i++) {
                if (mat[n][i] > 0 && visited[i] == 0) {
                    q.add(i);
                    visited[i] = 1;
                }
            }
        }
    }
}
