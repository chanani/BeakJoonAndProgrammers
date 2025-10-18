import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long first = scanner.nextLong();
        long second = scanner.nextLong();
       
        long min = Math.min(first, second);
        long max = Math.max(first, second);
        
        System.out.print((max - min + 1) * (min + max) / 2);
    }
}