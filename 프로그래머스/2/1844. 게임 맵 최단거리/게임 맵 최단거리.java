import java.util.*;

class Solution {
    private final int[] X = {1, -1, 0, 0};
    private final int[] Y = {0, 0, 1, -1};
    
    public int solution(int[][] maps) {
        int answer = -1;
        int n = maps.length;
        int m = maps[0].length;
        
        Queue<int[]> queue = new ArrayDeque<>();
        boolean[][] visited = new boolean[n][m];
        queue.offer(new int[]{0, 0, 1});
        visited[0][0] = true;
        
        while(!queue.isEmpty()){
            int[] cur = queue.poll();
            int cx = cur[0];
            int cy = cur[1];
            int count = cur[2];
            
            if(cx == n - 1 && cy == m - 1){
                return count;
            }
            
            for(int i = 0; i < 4; i++) {
                int nx = cx + X[i];
                int ny = cy + Y[i];
                
                if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    if(!visited[nx][ny] && maps[nx][ny] == 1) {
                        queue.offer(new int[]{nx, ny, count + 1});
                        visited[nx][ny] = true;
                    }
                }
            }
        }
        
        return answer;
    }
}