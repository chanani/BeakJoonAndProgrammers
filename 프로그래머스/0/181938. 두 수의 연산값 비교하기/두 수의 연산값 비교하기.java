class Solution {
    public int solution(int a, int b) {
        int ax = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int bx = 2 * a * b;
        int answer = ax >= bx ? ax : bx;
        return answer;
    }
}