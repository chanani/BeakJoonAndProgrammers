import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Queue<Integer> Q = new LinkedList<>();
        int point = 0;

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String text =  st.nextToken();
            if (text.equals("push")) {
                point = Integer.parseInt(st.nextToken());
                Q.offer(point);
            } else if (text.equals("pop")) {
                if (Q.size() == 0) {
                    sb.append(-1).append("\n");
                } else sb.append(Q.poll()).append("\n");
            } else if (text.equals("size")) {
                sb.append(Q.size()).append("\n");
            } else if (text.equals("empty")) {
                if (Q.isEmpty()) sb.append(1).append("\n");
                else sb.append(0).append("\n");
            } else if (text.equals("front")) {
                if (Q.isEmpty()) sb.append(-1).append("\n");
                else sb.append(Q.peek()).append("\n");
            } else if (text.equals("back")) {
                if (Q.isEmpty()) sb.append(-1).append("\n");
                else sb.append(point).append("\n");
            }
        }
        System.out.println(sb);
    }
}