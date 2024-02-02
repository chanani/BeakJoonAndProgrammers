import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int[][] arr;
    static int n, m;
    static boolean[][] visit;

    static int[] dx = {-1, 1, 0 ,0};
    static int[] dy = {0, 0, -1, 1};
    static Queue<int[]> Q = new LinkedList<>();

    public static void BFS(int x, int y) {
        Q.offer(new int[]{x,y});
        while(!Q.isEmpty()){
            int now[] = Q.poll();
            int nx = now[0];
            int ny = now[1];
            for (int i = 0; i < 4; i++) {
                int nextX = nx + dx[i];
                int nextY = ny + dy[i];
                if (nextX >= 1 && nextX <= n && nextY >= 1 && nextY <= m){
                    if (arr[nextX][nextY] == 1 && ! visit[nextX][nextY]){
                        Q.offer(new int[]{nextX, nextY});
                        visit[nextX][nextY] = true;
                        arr[nextX][nextY] = arr[nx][ny] + 1;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        arr = new int[n + 1][m + 1];
        visit = new boolean[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            String[] a = scan.next().split("");
            for (int j = 1; j <= m; j++) {
                arr[i][j] = Integer.parseInt(a[j - 1]);
            }
        }
        visit[1][1] = true;
        BFS(1, 1);
        System.out.println(arr[n][m]);
    }
}