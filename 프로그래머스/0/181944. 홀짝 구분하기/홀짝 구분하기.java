import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = n % 2 == 0 ? n + " is even" : n + " is odd";
        System.out.print(str);        
    }
}