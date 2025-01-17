import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int f = sc.nextInt();
            int answer = (n / 100) * 100;

            while (true) {
                if (answer % f == 0) {
                    break;
                }
                answer++;
            }
            System.out.printf("%02d", answer % 100);
            sc.close();
        }
    }