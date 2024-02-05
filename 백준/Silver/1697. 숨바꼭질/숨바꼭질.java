import java.util.*;
import java.io.*;

public class Main {
    static int n, m;
    static int[] ch = new int[100001];
    static int[] move = {-1, 1, 2};
    static Queue<Integer> Q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        if (n == m) System.out.println(0);
        else bfs(n);
    }

    public static void bfs(int v) {
        ch[v] = 1;
        Q.offer(v);
        while (!Q.isEmpty()) {
            int size = Q.size();
            for (int x = 0; x < size; x++) {
                int target = Q.poll();
                for (int i = 0; i < 3; i++) {
                    int nv;
                    if (i == 2) nv = target * move[i];
                    else nv = target + move[i];
                    if (nv == m) {
                        System.out.print(ch[target]);
                        return;
                    }
                    if (nv >= 0 && nv < 100001 && ch[nv] == 0) {
                        ch[nv] = 1;
                        Q.offer(nv);
                        ch[nv] = ch[target] + 1;
                    }
                }
            }
        }
    }
}