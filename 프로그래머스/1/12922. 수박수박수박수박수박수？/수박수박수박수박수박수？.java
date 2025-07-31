class Solution {
    public String solution(int n) {
        String str = "";
       for(int i = 1; i <= n; i++){
           str += i % 2 != 0 ? "수" : "박";
       }
       return str;
    }
}