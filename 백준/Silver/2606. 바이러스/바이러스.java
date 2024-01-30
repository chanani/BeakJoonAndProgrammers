import java.util.*;

public class Main {

    static int n, m, answer = 0;
    static int[] ch;
    static int[][] arr;

    public static void DFS(int v) {
        ch[v] = 1;
        if (v == n + 1) return;
        else {
            for (int i = 1; i <= n; i++) {
                if (arr[v][i] == 1 && ch[i] == 0) {
                    DFS(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        arr = new int[n + 1][n + 1];
        ch = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            arr[a][b] = 1;
            arr[b][a] = 1;
        }
        DFS(1);
        for (int i = 2; i <= n; i++) {
            if (ch[i] == 1) answer++;
        }
        System.out.println(answer);

    }
}