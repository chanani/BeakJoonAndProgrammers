import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String[][] arr =  new String[5][15];
        for(int i = 0; i < 5; i++){
            String[] str = scan.next().split("");
            for(int j = 0; j < str.length; j++) arr[i][j] = str[j];
        }

        String answer = "";
        for(int i = 0; i < 15; i++){
            for(int j = 0; j < 5; j++){
                if(arr[j][i] != null) answer += arr[j][i];
            }
        }
        System.out.println(answer);
    }
}