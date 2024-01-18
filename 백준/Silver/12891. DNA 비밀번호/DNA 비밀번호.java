import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int answer = 0;
        char accrue = ' ';
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); // 전체 문자열 길이
        int k = scan.nextInt(); // 부분 문자열 길이
        String str = scan.next();
        int[] arr = new int[4];
        int[] count = new int[5];
        for (int i = 0; i < 4; i++) {
            arr[i] = scan.nextInt();
        }

        for (int i = 0; i < k; i++) countArr(count, str.charAt(i));
        answer += cal(count, arr);
        count[4] = 0;

        int lt = 0;
        for (int i = k; i < n; i++) {
            char start = str.charAt(lt);
            char end = str.charAt(i);
            countArrM(count, start);
            countArr(count, end);
            answer += cal(count,arr);
            count[4] = 0;
            lt++;
        }
        System.out.println(answer);
    }

    public static int cal(int[] count, int[] arr) {
        int answer = 1;

        if (count[0] < arr[0]) return 0;
        if (count[1] < arr[1]) return 0;
        if (count[2] < arr[2]) return 0;
        if (count[3] < arr[3]) return 0;
        if (count[4] != 0) return 0;

        return answer;
    }

   public static void countArr(int[] count, char c){
        if (c == 'A') count[0]++;
        else if (c == 'C') count[1]++;
        else if (c == 'G') count[2]++;
        else if (c == 'T') count[3]++;
        else count[4]++;
   }

    public static void countArrM(int[] count, char c){
        if (c == 'A') count[0]--;
        else if (c == 'C') count[1]--;
        else if (c == 'G') count[2]--;
        else if (c == 'T') count[3]--;
        else count[4]--;
    }

}