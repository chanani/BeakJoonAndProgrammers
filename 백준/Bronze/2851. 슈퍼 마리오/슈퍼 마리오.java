import java.util.*;

public class Main{
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList();
        for(int i = 0; i < 10; i++){
            numbers.add(scanner.nextInt());
        }
        int point = 0;
        for(int i = 0; i < numbers.size(); i++){
            int temp = point + numbers.get(i);
            if(temp >= 100) {
                int min = 100 - point;
                int max = point + numbers.get(i) - 100;
                if(min == max || max < min) point = temp;
                break;
            }
            point = temp;
        }
        System.out.print(point);
    }
}