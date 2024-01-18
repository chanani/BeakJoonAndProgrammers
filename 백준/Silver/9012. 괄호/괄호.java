import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        String[] answer = new String[t];
        String[] arr = new String[t];
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < t; i++) arr[i] = scan.next();

        for(int i = 0; i < t; i++){
            for(char x : arr[i].toCharArray()){
                if(x == '(') stack.push(x);
                else {
                    if (stack.isEmpty()) {
                        stack.push(x);
                        answer[i] = "NO";
                        break;
                    }
                    if(stack.peek() == '(') {
                        stack.pop();
                    } else {
                        stack.push(x);
                        answer[i] = "NO";
                        break;
                    }
                }
            }
            if (stack.size() != 0) answer[i] = "NO";
            else answer[i] = "YES";
            stack.clear();
        }

        for(String x : answer){
            System.out.println(x);
        }
    }
}