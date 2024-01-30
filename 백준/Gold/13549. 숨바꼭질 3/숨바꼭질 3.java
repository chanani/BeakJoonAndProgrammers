import java.util.*;

public class Main {

    static int[] ch;
    static int[] dis = {1, -1, 2};
    static Queue<int[]> Q = new LinkedList<>();

    public static int BFS(int s, int e) {
        ch = new int[100001];
        int[] data = {s, 0};
        ch[s] = 1;
        Q.offer(data);
        while (!Q.isEmpty()) {
            int size = Q.size();
            for (int i = 0; i < size; i++) {
                int[] cur = Q.poll();
                ch[cur[0]] = 1;
                if (cur[0] == e) return cur[1];
                for (int j = 2; j >= 0; j--) {
                    int nc;
                    if (j != 2){
                        nc = cur[0] + dis[j];
                    } else {
                        nc = cur[0] * dis[j];
                    }
                    if (nc >= 1 && nc <= 100000 && ch[nc] == 0){
                        ch[nc] = 1;
                        int[] na = new int[2];
                        if (j != 2){
                            na[0] = nc;
                            na[1] = cur[1] + 1;
                            Q.offer(na);
                        } else {
                            na[0] = nc;
                            na[1] = cur[1];
                            Q.offer(na);
                        }
                    }
                }
            }
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int e = scan.nextInt();
        System.out.println(BFS(s, e));
    }
}