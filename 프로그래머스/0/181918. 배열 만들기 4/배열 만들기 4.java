import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        for(int i = 0; i < arr.length;){
            if(stk.size() == 0){
                stk.add(arr[i]); i++;
            } else if(stk.size() != 0 && stk.get(stk.size() - 1) < arr[i]){
                stk.add(arr[i]); i++;
            } else {
                stk.remove(stk.size() - 1);
            }
        }
        return stk.stream().mapToInt(i -> i).toArray();
    }
    
    
}