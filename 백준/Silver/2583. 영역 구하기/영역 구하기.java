import java.util.*;

public class Main {
    static int m, n, k;
    static int[][] arr;
    static boolean[][] visit;
    static ArrayList<Integer> list = new ArrayList<>();
    static Queue<int[]> Q;
    static int[] mx = {0, 0, -1, 1};
    static int[] my = {1, -1, 0, 0};

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        m = scan.nextInt();
        n = scan.nextInt();
        k = scan.nextInt();

        arr = new int[n][m];
        visit = new boolean[n][m];

        for(int i = 0; i < k; i++){
            int x1 = scan.nextInt();
            int y1 = scan.nextInt();
            int x2 = scan.nextInt();
            int y2 = scan.nextInt();
            for(int j = x1; j < x2; j++){
                for(int k = y1; k < y2; k++){
                    arr[j][k] = 1;
                }
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(arr[i][j] == 0 && !visit[i][j]){
                    visit[i][j] = true;
                    int count = BFS(i, j);
                    list.add(count);
                }
            }
        }
        Collections.sort(list);
        System.out.println(list.size());
        for(int x : list) System.out.print(x + " ");
    }

    public static int BFS(int x, int y){
        int count = 1;
        Q = new LinkedList<>();
        Q.offer(new int[]{x, y} );
        while(!Q.isEmpty()){
            int[] cur = Q.poll();
            for(int i = 0; i < 4; i++){
                int nx = cur[0] + mx[i];
                int ny = cur[1] + my[i];
                if(nx >= 0 && nx < n && ny >= 0 && ny < m){
                    if(arr[nx][ny] == 0 && !visit[nx][ny]){
                        count++;
                        Q.offer(new int[]{nx, ny});
                        visit[nx][ny] = true;
                    }
                }
            }
        }
        return count;
    }
}