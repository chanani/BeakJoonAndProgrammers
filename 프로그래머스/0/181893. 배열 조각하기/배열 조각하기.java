import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] query) {

         List<Integer> listArr = new ArrayList<>(); 
           for (int value : arr) {
            listArr.add(value); 
        }

        for(int i = 0;i < query.length; i++){
            int len = listArr.size();
            if(i % 2 == 0){  
                listArr = listArr.subList(0,query[i]+1);
            }else{
                listArr = listArr.subList(query[i],len);
            }
        }

        int[] answer = new int[listArr.size()];
        for (int i = 0; i < listArr.size(); i++) {
            answer[i] = listArr.get(i); 
        }

        return answer;
    }

}