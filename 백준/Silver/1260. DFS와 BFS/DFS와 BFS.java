import java.util.*;

public class Main {
    static int n, m; // 정점, 간선
    static int[] ch;
    static int[][] arr;
    static Queue<Integer> Q = new LinkedList<>();

    public static void DFS(int v) {

        if (ch[v] == 0){
            System.out.print(v + " ");
            ch[v] = 1;
        }
        if (v == n + 1) return;
        else {
            for (int i = 1; i <= n; i++) {
                if (arr[v][i] == 1 && ch[i] == 0){
                    DFS(i);
                }
            }
        }
    }

    public static void BFS(int v) {
        Q.offer(v);
        ch = new int[n + 1];
        ch[v] = 1;
        System.out.print(v + " ");
        while (!Q.isEmpty()) {
            int size = Q.size();
            for (int i = 0; i < size; i++) {
                int target = Q.poll();
                for (int j = 1; j <= n; j++) {
                    if (ch[j] == 0 && arr[target][j] == 1) {
                        System.out.print(j + " ");
                        ch[j] = 1;
                        Q.offer(j);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        int v = scan.nextInt(); // 시작 정점
        arr = new int[n + 1][n + 1];
        ch = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            arr[a][b] = 1;
            arr[b][a] = 1;
        }
        DFS(v);
        System.out.println();
        BFS(v);
    }
}