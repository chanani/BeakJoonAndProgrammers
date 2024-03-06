import java.util.*;

class Point{
    public int x, y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class Solution {
    static int[][] visit;
    static int[][] board;
    static int n, m;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    public int solution(int[][] maps) {
        n = maps.length;
        m = maps[0].length;
        visit = new int[n][m];
        BFS(0, 0, maps);
        if(visit[n - 1][m- 1] == 0) return -1;
        else return visit[n- 1][m- 1];
    }
    
    public static void BFS(int x, int y, int[][] maps){
        Queue<Point> Q = new LinkedList<>();
        Q.offer(new Point(x, y));
        visit[x][y] = 1;
        while(!Q.isEmpty()){
            Point point = Q.poll();
            for(int i = 0; i < 4; i++){
                int nx = point.x + dx[i];
                int ny = point.y + dy[i];
                if(nx >= 0 && nx < n && ny >= 0 && ny < m && maps[nx][ny] == 1){
                    maps[nx][ny] = 0;
                    Q.offer(new Point(nx, ny));
                    visit[nx][ny] = visit[point.x][point.y] + 1;
                }
            }
        }
        
    }
}