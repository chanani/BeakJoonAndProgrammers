
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int[] baseArr = {64, 32, 16, 8, 4, 2, 1};
        int count = 0;

        for (int i = 0; i < baseArr.length; i++) {
            if(baseArr[i] == X){
                System.out.print(1);
                return;
            }
        }

        int sum = 0;
        for (int i = 0; i < baseArr.length; i++) {
            int temp = sum + baseArr[i];
            if (temp < X){
                count++;
                sum = temp;
            } else if(temp == X){
                count++;
                break;
            }
        }

        System.out.print(count);
    }
}