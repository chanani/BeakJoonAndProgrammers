import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int answer = 0, count = 0;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arr = new int[n];
        int lt = -1, rt = 0;

        for(int i = 0; i < n; i++) arr[i] = scan.nextInt();

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1){
                count++;
                if (lt == -1) lt = i;
                else rt = i;
            }

            if (count == k) break;
        }

        if (count < k) answer = -1;
        else {
            answer = rt - lt + 1;
            rt += 1;
            for (int i = rt; i < n; i++) {
                if (arr[i] == 2) continue;
                lt++;
                while(arr[lt] == 2){
                    lt++;
                }
                answer = Math.min(answer, i - lt + 1);
            }
        }
        System.out.println(answer);
    }
}