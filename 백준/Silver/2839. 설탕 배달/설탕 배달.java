import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = 0;
        while(n > 0){
            if(n % 5 == 0){
                answer += n / 5;
                System.out.println(answer);
                return;
            }
            if(n < 3){
                System.out.println(-1);
                return;
            }
            n -= 3;
            answer++;
        }

        System.out.println(answer);
    }
}