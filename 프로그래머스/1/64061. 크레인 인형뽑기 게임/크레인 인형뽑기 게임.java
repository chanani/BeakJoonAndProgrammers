import java.util.ArrayList;
import java.util.List;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for (int move : moves) {
            int num = move - 1;
            for (int i = 0; i < board.length; i++) {
                if (board[i][num] != 0) {
                    if (!list.isEmpty() && list.get(list.size() - 1) == board[i][num]) {
                        list.remove(list.size() - 1);
                        answer += 2;
                    } else {
                        list.add(board[i][num]);
                    }
                    board[i][num] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}