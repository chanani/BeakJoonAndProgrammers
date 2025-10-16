import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        Stack<Integer> seconds = new Stack();
        for (int i = 0; i < count; i++) {
            seconds.push(scanner.nextInt());
        }
        
        int Y = 0, M = 0;

        while (seconds.size() > 0) {
            int time = seconds.pop();
            int YTime = time % 30 == time ? 1 : time % 29;
            int MTime = time % 60 == time ? 1 : time % 59;
            Y += YTime > 0 ? (time / 30 + 1) * 10 : (time / 30) * 10;
            M += MTime > 0 ? (time / 60 + 1) * 15 : (time / 60) * 15;
        }
        if (Y < M) {
            System.out.print("Y " + Y);
        } else if (M < Y) {
            System.out.print("M " + M);
        } else {
            System.out.print("Y M " + Y);
        }
    }
}