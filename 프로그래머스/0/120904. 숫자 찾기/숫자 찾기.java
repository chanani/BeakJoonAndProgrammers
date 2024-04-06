class Solution {
    public int solution(int num, int k) {
        int answer = String.valueOf(num).indexOf(String.valueOf(k)) + 1;
        return answer == 0 ? -1 : answer;
    }
}