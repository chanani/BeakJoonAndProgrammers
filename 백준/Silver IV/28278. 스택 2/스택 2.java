import java.util.*;

public class Main{
    static int n;
    static Stack<Integer> stack = new Stack<>();
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            int t = scan.nextInt();
            if(t == 1){
                int input = scan.nextInt();
                stack.add(input);
            } else if(t == 2){
                if(!stack.isEmpty()){
                    sb.append(stack.pop()).append("\n");
                } else sb.append(-1).append("\n");
            } else if(t == 3) sb.append(stack.size()).append("\n");
            else if(t == 4) {
                if(stack.isEmpty()) sb.append(1).append("\n");
                else sb.append(0).append("\n");
            } else if(t == 5) {
                if(!stack.isEmpty()) sb.append(stack.peek()).append("\n");
                else sb.append(-1).append("\n");
            }
        }
        System.out.println(sb);
    }
}