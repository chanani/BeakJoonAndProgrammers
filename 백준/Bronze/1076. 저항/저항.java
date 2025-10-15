import java.util.*;

public class Main {
  private static Map<String, color> colorMap = new HashMap();
    public static void main(String[] args){
        initColorMap();
        Scanner scan = new Scanner(System.in);
        String first = scan.next();
        String second = scan.next();
        String third = scan.next();
        long answer = (colorMap.get(first).value * 10 + colorMap.get(second).value) * colorMap.get(third).cal;
        System.out.print(answer);
    }

    public static void initColorMap(){
        colorMap.put("black", new color(0, 1));
        colorMap.put("brown", new color(1, 10));
        colorMap.put("red", new color(2, 100));
        colorMap.put("orange", new color(3, 1000));
        colorMap.put("yellow", new color(4, 10000));
        colorMap.put("green", new color(5, 100000));
        colorMap.put("blue", new color(6, 1000000));
        colorMap.put("violet", new color(7, 10000000));
        colorMap.put("grey", new color(8, 100000000));
        colorMap.put("white", new color(9, 1000000000));
    }

    private static class color{
        private long value;
        private long cal;

        public color(long value, long cal){
            this.value = value;
            this.cal = cal;
        }
    }
}