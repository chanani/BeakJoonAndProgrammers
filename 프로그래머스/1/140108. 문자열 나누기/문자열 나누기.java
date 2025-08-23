class Solution {
    public int solution(String s) {
       int cnt = 0;

        char x = s.charAt(0);
        int xCnt = 0;
        int notXCnt = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (xCnt == notXCnt) {
                if (xCnt != 0) cnt++;
                x = c; 
                xCnt = notXCnt = 0;
            }

            if (x == c) xCnt++;
            else notXCnt++;
        }

        return cnt + 1; 
    }
}