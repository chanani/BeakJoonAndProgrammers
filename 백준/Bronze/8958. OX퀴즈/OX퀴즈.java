import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) arr[i] = scan.next();

        for (int i = 0; i < n; i++) {
            int answer = 0;
            int count = 0;
            for(char x : arr[i].toCharArray()){
                if (x == 'O') {
                    count++;
                    answer += count;
                } else {
                    count = 0;
                }
            }
            System.out.println(answer);
        }

    }
}