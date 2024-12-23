import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
 
		int n = in.nextInt();
		int count = 1, range = 2; 
 
		if (n == 1) {
			System.out.print(1);
		} else {
            while (range <= n) { 
                range = range + (6 * count); 
                count++;
            }
            System.out.print(count);
		}
	}
}