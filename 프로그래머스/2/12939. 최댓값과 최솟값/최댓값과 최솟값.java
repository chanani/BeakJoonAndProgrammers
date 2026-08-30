import java.util.*;

class Solution {
    public String solution(String s) {
        List<Integer> list = new ArrayList<>();
        
        for(String str : s.split(" ")) {
            list.add(Integer.parseInt(str));
        }
        
        Collections.sort(list);
        
        return list.get(0) + " " + list.get(list.size() - 1);
    }
}