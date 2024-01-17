import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int answer = 0, sum = 0;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = scan.nextInt();
        for(int i = 0; i < k; i++) sum += arr[i];
        answer = sum;
        int lt = 0;
        for(int i = k; i < n; i++){
            sum = sum + arr[i] - arr[lt];
            if(answer < sum) answer = sum;
            lt++;
        }

        System.out.println(answer);
    }

}