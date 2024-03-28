class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        myString = myString.replaceAll("A", "C").replaceAll("B", "A").replaceAll("C", "B");
        if(myString.contains(pat)) answer = 1;
        return answer;
    }
}