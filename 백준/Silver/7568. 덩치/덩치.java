import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int pc = scan.nextInt();
        int[][] people = new int[pc][2];
        int[] answer = new int[pc];
        for(int i = 0; i < pc; i++){
            for(int j = 0; j < 2; j++){
                people[i][j] = scan.nextInt();
            }
        }

        for(int i = 0; i < pc; i++){
            int count = 1;
            for(int j = 0; j < pc; j++){
                boolean build = false;
                if(people[i][0] < people[j][0] && people[i][1] < people[j][1]) build = true;
                if(build) count++;
            }
            answer[i] = count;
        }
        for(int x : answer) System.out.print(x + " ");
    }
}