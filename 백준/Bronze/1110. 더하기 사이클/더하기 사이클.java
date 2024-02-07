import java.util.*;
import java.io.*;
public class Main{

    public static void main(String[] arg) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        int n = Integer.parseInt(br.readLine());
        int copy = n;

        while(true){
            int ten = copy / 10; // 10의 자리
            int one = copy % 10; // 1의 자리
            copy = one * 10 + (ten + one) % 10;
            answer++;
            if(n == copy) break;
        }
        System.out.println(answer);
    }
}