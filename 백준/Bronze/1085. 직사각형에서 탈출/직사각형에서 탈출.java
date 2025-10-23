import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int width = w - x < x ? w - x : x;
        int height = h - y < y ? h - y : y;
        System.out.println(Math.min(width, height));
    }
}