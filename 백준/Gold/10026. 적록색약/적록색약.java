import java.util.*;

public class Main{
    static int n, answer;
    static String[][] arr;
    static boolean[][] visit;
    static int[] mx = {0, 0, 1, -1};
    static int[] my = {1, -1, 0, 0};

    public static void DFS(int x, int y, int l){
        visit[x][y] = true;

        if(l == 0){
            for(int i = 0; i < 4; i++){
                int nx = x + mx[i];
                int ny = y + my[i];
                if(nx >= 0 && ny >= 0 && nx < n && ny < n){
                    if(!visit[nx][ny] && arr[nx][ny].equals(arr[x][y])){
                        DFS(nx, ny, l);
                    }
                }
            }
        } else {
            for(int i = 0; i < 4; i++){
                int nx = x + mx[i];
                int ny = y + my[i];
                if(nx >= 0 && ny >= 0 && nx < n && ny < n){
                    if(!visit[nx][ny]){
                        if(arr[nx][ny].equals("R")){
                            if(arr[x][y].equals("R") || arr[x][y].equals("G")){
                                DFS(nx, ny, l);
                            }
                        } else if(arr[nx][ny].equals("G")){
                            if(arr[x][y].equals("R") || arr[x][y].equals("G")){
                                DFS(nx, ny, l);
                            }
                        } else if(arr[nx][ny].equals("B")){
                            if(arr[x][y].equals("B")){
                                DFS(nx, ny, l);
                            }
                        }
                    }
                }
            }

        }


    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        arr = new String[n][n];
        for(int i = 0; i < n; i++){
            String[] str = scan.next().split("");
            for(int j = 0; j < n; j++){
                arr[i][j] = str[j];
            }
        }

        for(int i = 0; i < 2; i++){ // 탐색 횟수
            visit = new boolean[n][n];
            answer = 0;
            if(i == 0){
                for(int j = 0; j < n; j++){
                    for(int k = 0; k < n; k++){
                        if(!visit[j][k]){
                            answer++;
                            DFS(j, k, i);
                        }
                    }
                }
            } else {
                for(int j = 0; j < n; j++){
                    for(int k = 0; k < n; k++){
                        if(!visit[j][k]){
                            answer++;
                            DFS(j, k, i);
                        }
                    }
                }
            }
            System.out.print(answer + " ");
        }

    }
}