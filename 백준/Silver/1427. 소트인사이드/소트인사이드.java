import java.util.*;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String n = scan.next();
        int[] arr = new int[n.length()];
        for(int i = 0; i < n.length(); i++) arr[i] = Integer.parseInt(n.substring(i, i + 1));
        
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j] < arr[j + 1]){
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        for(int x : arr) System.out.print(x);
        
    }
}