import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[3];  //정렬할 배열
        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());  //입력받은 수를 배열에 저장
        }
        Arrays.sort(arr);  //배열 정렬하기
        for (int i = 0; i < 3; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}