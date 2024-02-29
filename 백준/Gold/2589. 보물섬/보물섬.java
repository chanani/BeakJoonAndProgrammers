import java.util.*;

public class Main{
    
    static int n, m, answer;
    static String[][] arr;
    static boolean[][] visit;
    static int[] mx = {0, 0, 1, -1};
    static int[] my = {1, -1, 0, 0};
    static Queue<int[]> Q;

    public static int BFS(int x, int y){
        Q = new LinkedList<>();
        visit[x][y] = true;
        Q.offer(new int[]{x, y, 0});
        int result = Integer.MIN_VALUE;
        while(!Q.isEmpty()){
            int[] ca = Q.poll();
            result = Math.max(ca[2], result);
            for(int i = 0; i < 4; i++){
                int nx = ca[0] + mx[i];
                int ny = ca[1] + my[i];
                if(nx >= 0 && ny >= 0 && nx < n && ny < m){
                    if(!visit[nx][ny]&& arr[nx][ny].equals("L")){
                        visit[nx][ny] = true;
                        Q.offer(new int[]{nx, ny, ca[2] + 1});
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        arr = new String[n][m];

        for(int i = 0; i < n; i++){
            String[] str = scan.next().split("");
            for(int j = 0; j < m; j++){
                arr[i][j] = str[j];
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(arr[i][j].equals("L")){
                    visit = new boolean[n][m];
                    int result = BFS(i, j);
                    answer = Math.max(answer, result);
                }
            }
        }
        System.out.println(answer);
    }
}