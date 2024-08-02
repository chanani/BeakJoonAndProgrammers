import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr) {
        int check = 0;
        for(int i = 0; i <= 10; i++){
            if(arr.length <= Math.pow(2, i)) {
                check = (int)Math.pow(2, i);
                break;
            }
        }
        ArrayList<Integer> list = (ArrayList<Integer>) Arrays.stream(arr).boxed().collect(Collectors.toList());
        while(list.size() < check){
            list.add(0);
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}