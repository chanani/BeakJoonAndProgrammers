import java.util.*;

public class Main {
    public static void main(String[] args) {
        int answer = 0;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int k = scan.nextInt();
        int[][] arr = new int[n][m];
        if(m < k) {
            System.out.println(0);
            return;
        }
        for (int i = 0; i < n; i++) {
            String[] str = scan.next().split("");
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(str[j]);
            }
        }

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < k; j++) {
                if (arr[i][j] == 0) count++;
            }
            if (count >= k) answer++;
            int lt = 0;
            for (int l = k; l < m; l++) {
                if (arr[i][l] == 0) count++;
                if (arr[i][lt] == 0) count--;
                if (count >= k) answer++;
                lt++;
            }
        }

        System.out.println(answer);
    }
}