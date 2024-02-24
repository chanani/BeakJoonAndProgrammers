import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(true){
            String answer = "yes";
            Stack<Character> stack = new Stack<>();
            String str = scan.nextLine();
            if(str.length() == 1 && str.equals(".")) break;
            for(char x : str.toCharArray()){
                if(stack.isEmpty()){
                    if(x == ']' || x == ')') {
                        answer = "no";
                        break;
                    }
                    else if (x == '[' || x == '(') stack.push(x);
                } else {
                    if (x == '[' || x == '(') stack.push(x);
                    else {
                        if(x == ']') {
                            if(stack.peek() == '[') stack.pop();
                            else {
                                answer = "no";
                                break;
                            }
                        } else if (x == ')'){
                            if(stack.peek() == '(') stack.pop();
                            else {
                                answer = "no";
                                break;
                            }
                        }
                    }
                }
            }
            if(stack.size() != 0) answer = "no";
            System.out.println(answer);
        }

    }
}