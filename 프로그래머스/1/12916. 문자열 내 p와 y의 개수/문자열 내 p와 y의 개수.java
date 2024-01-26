class Solution {
    boolean solution(String s) {
        int p = 0, y = 0;

        for(char x : s.toLowerCase().toCharArray()){
            if(x == 'p') p++;
            else if(x == 'y') y++;
        }

        if(p != y) return false;
        else return true;
        
    }
}