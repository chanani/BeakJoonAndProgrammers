class Solution {
    public int solution(String myString, String pat) {
        myString = myString.toUpperCase();
        pat = pat.toUpperCase();
        if(myString.contains(pat)) return 1;
        return 0;
    }
}