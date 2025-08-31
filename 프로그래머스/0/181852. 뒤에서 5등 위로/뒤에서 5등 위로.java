import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        return IntStream.range(0, num_list.length)
                .filter(index -> index >= 5)
                .map(index -> num_list[index])
                .toArray();
    }
}