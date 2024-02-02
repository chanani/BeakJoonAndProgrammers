
import java.util.*;

public class Main {

    static int n;
    static ArrayList<Integer> result = new ArrayList<>();
    static boolean[][] visit;
    static int[][] arr;
    static Queue<int[]> Q = new LinkedList<>();
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int count;

    public static int BFS(int x, int y) {
        Q.offer(new int[]{x, y});
        visit[x][y] = true;
        count++;
        while (!Q.isEmpty()) {
            int[] cur = Q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];
                if (nx >= 1 && nx <= n && ny >= 1 && ny <= n) {
                    if (arr[nx][ny] == 1 && !visit[nx][ny]) {
                        visit[nx][ny] = true;
                        Q.offer(new int[]{nx, ny});
                        count++;
                    }
                }
            }
        }


        return count;
    }

    public static void DFS(int x, int y) {
        if (x == n + 1 && y == n) return;
        else {
            if (arr[x][y] == 1 && !visit[x][y]) {
                count = 0;
                int turn = BFS(x, y);
                result.add(turn);
            }
            if (x == n && y == n){
                x = n + 1;
                y = n - 1;
            } else if (y >= n){
                y = 0;
                x++;
            }
            DFS(x, y + 1);
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        arr = new int[n + 1][n + 1];
        visit = new boolean[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            String[] str = scan.next().split("");
            for (int j = 1; j <= n; j++) {
                arr[i][j] = Integer.parseInt(str[j - 1]);
            }
        }

        DFS(1, 1);
        Collections.sort(result);
        System.out.println(result.size());
        for (
                int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}