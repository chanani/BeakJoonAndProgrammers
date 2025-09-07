import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        Integer[] sortArr = Arrays.stream(emergency)
                          .boxed()
                          .sorted()
                          .toArray(Integer[]::new);
        int[] answer = new int[emergency.length];

        for (int i = 0; i < emergency.length; i++) {
            int k = 0;
            for (int j = sortArr.length; j > 0; j--) {
                if(sortArr[k].equals(emergency[i])){
                    answer[i] = j;
                }
                k++;
            }
        }
        return answer;
    }
}