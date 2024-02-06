import java.util.*;
import java.io.*;
public class Main{
    static int n, m;
    static int[][] arr;
    static boolean[] visit;

    public static void DFS(int v){
        if(visit[v]) return;
        else {
            visit[v]= true;
            for(int i = 1; i <= n; i++){
                if(arr[v][i] == 1){
                    DFS(i);
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        arr = new int[n + 1][n + 1];
        for(int i = 1; i <= m; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            arr[a][b] = 1;
            arr[b][a] = 1;
        }
        visit = new boolean[n + 1];
        int answer = 0;
        for(int i = 1; i <= n; i++){
            if(!visit[i]){
                DFS(i);
                answer++;
            }
        }
        System.out.println(answer);
    }
}