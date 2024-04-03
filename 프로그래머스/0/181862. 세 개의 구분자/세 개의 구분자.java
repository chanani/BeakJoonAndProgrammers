import java.util.*;
class Solution {
    public ArrayList<String> solution(String myStr) {
        ArrayList<String> list = new ArrayList<>();
        String[] answer = myStr.replaceAll("[a-c]", "_").split("_");
        for(String x : answer){
            if(!x.equals("")) list.add(x);
        } 
        if(list.isEmpty()) list.add("EMPTY");
        return list;
    }
}