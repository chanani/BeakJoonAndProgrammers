import java.util.*;

public class Main {
    static int n, m, answer;
    static boolean[][] visit;
    static int[][] arr;
    static int[] vx = {0, 0, 1, -1, 1, 1, -1 ,-1};
    static int[] vy = {1, -1, 0, 0, 1, -1, -1, 1};

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (true) {
            m = scan.nextInt();
            n = scan.nextInt();
            if (n == 0 && m == 0) break;
            arr = new int[n + 1][m + 1];
            visit = new boolean[n + 1][m + 1];
            answer = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    arr[i][j] = scan.nextInt();
                }
            }
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    if (!visit[i][j] && arr[i][j] == 1) {
                        answer++;
                        BFS(i, j);
                    }
                }
            }
            sb.append(answer).append("\n");

        }
        System.out.println(sb);
    }

    public static void BFS(int x, int y) {
        Queue<int[]> Q = new LinkedList<>();
        Q.offer(new int[]{x, y});
        visit[x][y] = true;
        while (!Q.isEmpty()) {
            int[] na = Q.poll();
            int cx = na[0];
            int cy = na[1];
            for (int i = 0; i < 8; i++) {
                int nx = cx + vx[i];
                int ny = cy + vy[i];
                if (nx > 0 && nx <= n && ny > 0 && ny <= m) {
                    if (!visit[nx][ny] && arr[nx][ny] == 1) {
                        Q.offer(new int[]{nx, ny});
                        visit[nx][ny] = true;
                    }
                }
            }
        }

    }
}