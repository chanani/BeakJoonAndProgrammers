import java.util.*;
class Solution {
    public ArrayList<Integer> solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            boolean check = true;
            for(int j = 0; j < delete_list.length; j++){
                if(arr[i] == delete_list[j]) {
                    check = false;
                    break;
                }
            }
            if(check) list.add(arr[i]);
        }
        return list;
    }
}