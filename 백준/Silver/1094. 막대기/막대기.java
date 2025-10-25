import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int count = 0;

        while(X > 0){
            if(X % 2 == 1){
                count++;
            }
            X = X / 2;
        }

        System.out.print(count);
    }
}