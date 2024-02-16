import java.util.*;

public class Main{
    static int n;
    static Stack<Integer> stack = new Stack<>();
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int input = scan.nextInt();
            if(input == 0) stack.pop();
            else stack.push(input);
        }

        int answer = 0;
        for(int x : stack) answer += x;
        System.out.println(answer);
    }
}