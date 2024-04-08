import java.util.*;

public class Main {
    static int n, m;
    static long answer;
    public static void DFS(long L, long sum){
        if(sum > m) return;
        else if (sum == m){
            answer = L;
        } else {
            DFS(L + 1, sum * 2);
            DFS(L + 1, sum * 10 + 1);
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        DFS(0, n);
        if(answer == 0) answer = -1;
        else answer =  answer + 1;
        System.out.println(answer);
    }
}