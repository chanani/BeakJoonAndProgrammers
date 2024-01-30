import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i = 0; i < t; i++) {

            int H = scan.nextInt();
            int W = scan.nextInt();
            int N = scan.nextInt();
            if(N % H == 0) {
                System.out.println((H * 100) + (N / H));
            } else {
                System.out.println(((N % H) * 100) + ((N / H) + 1));
            }
        }
    }
}