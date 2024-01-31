import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            String command = input[0];
            if (command.equals("push")) {
                int value = Integer.parseInt(input[1]);
                stack.push(value);
            } else {
                if (command.equals("pop")) {
                    if (stack.isEmpty()) System.out.println(-1);
                    else System.out.println(stack.pop());
                } else if (command.equals("size")) System.out.println(stack.size());
                else if (command.equals("empty")) {
                    if (stack.isEmpty()) System.out.println(1);
                    else System.out.println(0);
                } else if (command.equals("top")) {
                    if (stack.isEmpty()) System.out.println(-1);
                    else System.out.println(stack.peek());
                }
            }
        }
    }
}