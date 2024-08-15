import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < name.length; i++){
            map.put(name[i], yearning[i]);
        }
        
        for(int i = 0; i < photo.length; i++){
            for(int j = 0; j < photo[i].length; j++){
                String pn = photo[i][j];
                for(int k = 0; k < name.length; k++){
                    if(name[k].equals(pn)){
                        answer[i] += map.get(photo[i][j]);
                        break;
                    }
                }
                
            }
        }
        
        return answer;
    }
}