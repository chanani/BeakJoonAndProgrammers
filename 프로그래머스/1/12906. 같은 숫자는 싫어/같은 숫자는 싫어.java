import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> queue = new Stack<>();
        for(int i : arr){
            if(queue.isEmpty() || queue.peek() != i){
               queue.add(i);
            }
        }
        return queue.stream().mapToInt(Integer::intValue).toArray();
    }
}