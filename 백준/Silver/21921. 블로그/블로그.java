import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();
        int c = scan.nextInt();
        int[] arr = new int[day];
        int[] answer = new int[2];
        int sum = 0, lt = 0;
        for (int i = 0; i < day; i++) arr[i] = scan.nextInt();
        for (int i = 0; i < c; i++) {
            sum += arr[i];
            answer[0] += arr[i];
            answer[1] = 1;
        }

        for (int rt = c; rt < day; rt++) {
            sum += arr[rt];
            sum -= arr[lt++];
            if (answer[0] == sum) answer[1]++;
            else if (answer[0] < sum) {
                answer[0] = sum;
                answer[1] = 1;
            }
        }

        if (answer[0] == 0) {
            System.out.println("SAD");
        } else {
            for (int x : answer) {
                System.out.println(x);
            }
        }
    }
}