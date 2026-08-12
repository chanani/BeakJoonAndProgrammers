import java.util.*;

class Solution {
    int n;
    int m;
    int[] X = {1, -1, 0, 0};
    int[] Y = {0, 0, 1, -1};
    
    public int solution(int[][] maps) {
        int answer = 1;
        this.n = maps.length;
        this.m = maps[0].length;
        boolean[][] visited = new boolean[n][m];
        Deque<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{0, 0, 1});
        visited[0][0] = true;
        
        while(!queue.isEmpty()) {
            int[] cur = queue.poll();
            int count = cur[2];
            
            if(cur[0] == n - 1 && cur[1] == m - 1) {
                return count;
            }
            
            for(int i = 0; i < 4; i++) {
                int nx = cur[0] + X[i];
                int ny = cur[1] + Y[i];
                if(nx >= 0 && nx < n && ny >= 0 && ny < m){
                    if(!visited[nx][ny] && maps[nx][ny] == 1){
                        queue.offer(new int[]{nx, ny, count + 1});
                        visited[nx][ny] = true;
                    }
                }
                
            }
        }
        
        
        return -1;
    }
}