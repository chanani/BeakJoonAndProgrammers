import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int data = 1;
            for(int j=0; j<b; j++) {
                data *= a;
                data %= 10;
            }
            if(data == 0)
                data = 10;
            list.add(data);
        }

        for(int i=0; i<list.size(); i++)
            System.out.println(list.get(i));
    }
}