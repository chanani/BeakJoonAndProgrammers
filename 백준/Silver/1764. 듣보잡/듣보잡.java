import java.util.*;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        int n = scan.nextInt();
        int m = scan.nextInt();
        int count = 0;
        ArrayList<String> list = new ArrayList<>();

        String[] r = new String[n];
        String[] l = new String[m];
        for(int i = 0; i < n; i++) {
            String str = scan.next();
            map.put(str, 0);
        }
        for(int i = 0; i < m; i++){
            String str = scan.next();
            if(map.get(str) != null) {
                count++;
                list.add(str);
            }
        }

        System.out.println(count);
        Collections.sort(list);
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }


    }
}