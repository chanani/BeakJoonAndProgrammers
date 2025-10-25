import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.next();
        String second = scanner.next();
        int lengthCount = 100;

        int inputLength = Math.abs(first.length() - second.length()) + 1;

        for (int i = 0; i < inputLength; i++) {
            String[] firstArr = first.split("");
            String[] secondArr = second.split("");
            int tempCount = 0;
            for (int j = 0; j < firstArr.length; j++) {
                if (!firstArr[j].equals(secondArr[j + i])) {
                    tempCount++;
                }
            }
            lengthCount = Math.min(lengthCount, tempCount);
        }
        System.out.print(lengthCount);
    }
}