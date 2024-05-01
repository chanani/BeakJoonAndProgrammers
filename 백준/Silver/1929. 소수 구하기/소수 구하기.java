import java.util.*;
import java.util.stream.Collectors;
public class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] check = new int[m + 1];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 2; i <= m; i++){
            if(check[i] == 0){
                list.add(i);
                for(int j = i; j <= m; j += i){
                    check[j] = 1;
                }
            }
        }

        ArrayList<Integer> answer = (ArrayList<Integer>) list.stream().filter(x -> x >= n).collect(Collectors.toList());
        for(int x : answer) System.out.println(x);

    }
}