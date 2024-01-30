import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 1;
        int[] arr = new int[10];
        for (int i = 0; i < 3; i++) sum *= scan.nextInt();
        String answer = String.valueOf(sum);
        for (int i = 0; i < answer.length(); i++) {
           int n = Character.getNumericValue(answer.charAt(i));
           arr[n] = arr[n] + 1;
        }
        for(int x : arr) System.out.println(x);
    }
}