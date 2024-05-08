import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) > 64 && a.charAt(i) < 91){
                answer += a.substring(i, i + 1).toLowerCase();
            } else if(a.charAt(i) > 96 && a.charAt(i) < 123){
                answer += a.substring(i, i + 1).toUpperCase();
            } 
        }
        System.out.print(answer);
    }
}