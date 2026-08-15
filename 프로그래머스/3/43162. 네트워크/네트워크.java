import java.util.*;

class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];
        
        for(int i = 0; i < n; i++) {
            if(!visited[i]) {
                answer++;
                dfs(computers, visited, i);
            }
        }
        return answer;
    }
    
    private void dfs(int[][] computers, boolean[] visited, int cur) {
        visited[cur] = true;

        int[] computer = computers[cur];
        for(int i = 0; i < computer.length; i++) {
            if(!visited[i] && computer[i] == 1) {
                dfs(computers, visited, i);
            }
        }
    }
}