import java.util.*;
import java.util.stream.IntStream;
class Solution {
    public ArrayList<String> solution(String[] names) {
        ArrayList<String> answer = new ArrayList<>();
        IntStream.range(0, names.length).forEach(i -> {
            if (i % 5 == 0) answer.add(names[i]);
        });
        return answer;
    }
}