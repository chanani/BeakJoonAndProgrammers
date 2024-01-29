import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scan.nextInt();
        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum += arr[i];
        }
        int answer = sum;
        int lt = 0, rt = m;
        while(lt < n){
            rt %= n;
            sum += arr[rt] - arr[lt];
            answer = Math.max(answer, sum);
            lt++;
            rt ++;
            //if (rt == n) rt = 0;
        }
        System.out.println(answer);
    }
}