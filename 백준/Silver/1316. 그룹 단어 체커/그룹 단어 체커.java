import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int answer = 0;
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String[] arr = new String[num];
        for (int i = 0; i < num; i++) {
            arr[i] = scan.next();
        }

        for (int i = 0; i < num; i++) {
            String[] strArr = arr[i].split("");
            String str = strArr[0];
            for (int j = 1; j < strArr.length; j++) {
                if (!strArr[j - 1].equals(strArr[j])){
                    if (str.contains(strArr[j])) break;
                }
                str += strArr[j];
            }
            if (str.length() == arr[i].length()) answer++;
        }

        System.out.println(answer);
    }

}