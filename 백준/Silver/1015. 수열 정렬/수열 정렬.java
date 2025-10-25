import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        int n = scanner.nextInt();
        int[] arrayA = new int[n];
        
        for(int i = 0; i < n; i++){
            arrayA[i] = scanner.nextInt();
        }
        
        int[] arrayB = arrayA.clone();
        Arrays.sort(arrayB);
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(arrayA[i] == arrayB[j]){
                    sb.append(j + " ");
                    // 같은 값이 있을 경우(-1로 사용 처리)
                    arrayB[j] = -1;
                    break;
                }
            }
        }
        
        System.out.println(sb);
    }
}