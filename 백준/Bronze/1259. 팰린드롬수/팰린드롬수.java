import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        while(true){
            int n = scan.nextInt();
            boolean bool = true;
            if(n == 0) break;
            String[] str = String.valueOf(n).split("");
            int x = str.length - 1;
            for(int i = 0; i < str.length / 2; i++){
                if(!str[i].equals(str[x--])) bool = false;
            }
            if(bool) System.out.println("yes");
            else System.out.println("no");
        }
    }
}