import java.util.*;


public class Main {

    static int N;
    static int[][] arr;
    static boolean[][] visit;
    static int[] mx = {1, 0, -1, 0};
    static int[] my = {0, -1, 0, 1};

    static void DFS(int x, int y, int height) {
        visit[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + mx[i];
            int ny = y + my[i];

            if (nx < 0 || ny < 0 || nx >= N || ny >= N || arr[nx][ny] <= height || visit[nx][ny])
                continue;

            DFS(nx, ny, height);

        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new int[N][N];

        int max = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
                if (max < arr[i][j])
                    max = arr[i][j];
            }
        }

        int answer = 0;
        for (int i = 0; i <= max; i++) {
            int count = 0;
            visit = new boolean[N][N];
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    if (arr[j][k] > i && !visit[j][k]) {
                        count++;
                        DFS(j, k, i);
                    }
                }
            }
            answer = Math.max(count, answer);
        }

        System.out.println(answer);
    }

    
}
