import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        int cut = scan.nextInt();
        int[] arr = new int[total];
        
        for(int i = 0; i < total; i++){
            arr[i] = scan.nextInt();
        }
        
        Arrays.sort(arr);
        
        System.out.print(arr[total - cut]);
        
    }
}