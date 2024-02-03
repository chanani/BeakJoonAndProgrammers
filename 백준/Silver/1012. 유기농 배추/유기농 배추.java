import java.util.*;
public class Main {
    static int x, y, k, answer, t;
    static int[][] dis;
    static boolean[][] visit;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    public static void dfs(int cx, int cy){
        visit[cx][cy] = true;
        for(int i = 0; i < 4; i++){
            int nx = cx + dx[i];
            int ny = cy + dy[i];
            if(nx >= 0 && nx < x && ny >= 0 && ny < y){
                if(dis[nx][ny] == 1 && !visit[nx][ny]){
                    dfs(nx, ny);
                }
            }
        }

    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        t = scan.nextInt();
        for(int v = 0; v < t; v++){
            x = scan.nextInt();
            y = scan.nextInt();
            k = scan.nextInt();
            dis = new int[x][y];
            visit = new boolean[x][y];
            answer = 0;
            for(int i = 0; i < k; i++){
                int a = scan.nextInt();
                int b = scan.nextInt();
                dis[a][b] = 1;
            }

            for(int i = 0; i < x; i++){
                for(int j = 0; j < y; j++){
                    if(dis[i][j] == 1 && !visit[i][j]){
                        answer++;
                        dfs(i, j);
                    }
                }
            }
            System.out.println(answer);
        }

    }
}