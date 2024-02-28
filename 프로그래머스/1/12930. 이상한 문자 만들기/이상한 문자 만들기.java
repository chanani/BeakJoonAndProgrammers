import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ", -1);
        for(int i = 0; i < arr.length; i++){
            String[] word = arr[i].split("");
            for(int j = 0; j < arr[i].length(); j++){
                if(j % 2 == 0) answer += word[j].toUpperCase();
                else answer += word[j].toLowerCase();
            }
            if(i != arr.length - 1) answer += " ";
        }
        return answer;
    }
}