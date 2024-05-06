import java.util.*;

class Main{
     public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(true){
            int[] arr = new int[3];
            arr[0] = scan.nextInt();
            arr[1] = scan.nextInt();
            arr[2] = scan.nextInt();
            if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0) break;
            Arrays.sort(arr);
            if((Math.pow(arr[0], 2) + Math.pow(arr[1], 2)) == Math.pow(arr[2], 2)){
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}