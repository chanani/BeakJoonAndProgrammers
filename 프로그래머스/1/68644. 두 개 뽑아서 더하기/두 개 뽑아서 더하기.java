import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] numbers) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                if (!answer.contains(sum)){
                    answer.add(sum);
                }
            }
        }
        
        Collections.sort(answer);
        
        return answer;
    }
}