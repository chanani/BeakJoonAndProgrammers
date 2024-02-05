import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        int[] ch = new int[n];
        for (int i = 0; i < n; i++) {
            ch[i] = Integer.parseInt(st.nextToken());
            map.put(ch[i], map.getOrDefault(ch[i], 0) + 1);
        }

        int m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            int input = Integer.parseInt(st.nextToken());
            if (map.get(input) == null) sb.append(0).append(" ");
            else sb.append(map.get(input)).append(" ");
        }
        System.out.println(sb);
    }
}
