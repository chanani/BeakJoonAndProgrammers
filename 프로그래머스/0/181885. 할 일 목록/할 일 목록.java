import java.util.stream.*;
import java.util.*;
class Solution {
    public ArrayList<String> solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> answer = new ArrayList<>();
        IntStream.range(0, todo_list.length).forEach(i -> {
            if(!finished[i]) answer.add(todo_list[i]);
        });
        return answer;
    }
}