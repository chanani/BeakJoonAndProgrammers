import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i < score.length; i++) {
            if(arr.size() < k) {
                arr.add(score[i]);
            } else {
                int min = arr.get(0);
                if(score[i] > min) {
                    arr.remove(0);
                    arr.add(score[i]);
                }
            }
            Collections.sort(arr);
            answer[i] = arr.get(0);
        }
        return answer;
    }
}