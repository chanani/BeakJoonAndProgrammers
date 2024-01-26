import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) arr2[i] = scan.nextInt();
        int m = scan.nextInt();
        int[] arr1 = new int[m];
        for (int i = 0; i < m; i++) arr1[i] = scan.nextInt();
        Arrays.sort(arr2);

        int[] answer = new int[m];

        int i = 0;
        while(i < m){
            int j = arr2.length / 2;
            if (arr1[i] == arr2[j]) {
                answer[i] = 1;
            } else if (arr1[i] > arr2[j]){
                while(j < n){
                    if (arr1[i] == arr2[j]) {
                        answer[i] = 1;
                        break;
                    }
                    j++;
                }
            } else if(arr1[i] < arr2[j]){
                while(j >= 0){
                    if (arr1[i] == arr2[j]){
                        answer[i] = 1;
                        break;
                    }
                    j--;
                }
            }
            i++;
        }
        for(int x : answer) System.out.println(x);
    }
}