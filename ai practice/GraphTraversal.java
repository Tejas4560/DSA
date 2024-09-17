
import java.util.*;

public class GraphTraversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int n = scanner.nextInt();
        System.out.print("Enter number of edges: ");
        int m = scanner.nextInt();

        int[][] a = new int[n][n];

        System.out.println("Now enter vertex numbers between which edges are present");
        int v1, v2;
        for (int i = 0; i < m; i++) {
            System.out.println("Edge " + (i + 1) + ":");
            System.out.print("Vertex 1: ");
            v1 = scanner.nextInt();
            System.out.print("Vertex 2: ");
            v2 = scanner.nextInt();

            // Error handling for invalid vertices
            if (v1 < 0 || v1 >= n || v2 < 0 || v2 >= n) {
                System.out.println("Invalid vertices! Vertex number should be between 0 and " + (n - 1));
                return;
            }

            System.out.println("Vertex " + v1 + " <---------> Vertex " + v2);
            a[v1][v2] = 1;
            a[v2][v1] = 1;
        }

        System.out.print("Enter the root vertex: ");
        int root = scanner.nextInt();

        if (root < 0 || root >= n) {
            System.out.println("Invalid root vertex!");
            return;
        }

        // BFS
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n];
        q.add(root);
        visited[root] = true;

        System.out.println("Following is the BFS traversal of the provided graph:");
        while (!q.isEmpty()) {
            int x = q.poll();
            System.out.print(x + " ");
            for (int i = 0; i < n; i++) {
                if (a[x][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    q.add(i);
                }
            }
        }

        // Reset visited array
        Arrays.fill(visited, false);

        // DFS
        Stack<Integer> s = new Stack<>();
        s.push(root);
        visited[root] = true;

        System.out.println("\n\nFollowing is the DFS traversal of the provided graph:");
        while (!s.isEmpty()) {
            int x = s.pop();
            System.out.print(x + " ");
            for (int i = 0; i < n; i++) {
                if (a[x][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    s.push(i);
                }
            }
        }

        scanner.close();
    }
}
