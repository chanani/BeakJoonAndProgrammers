class Solution {
    public int solution(int a, int b) {
        int ax = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int bx = Integer.parseInt(String.valueOf(b) + String.valueOf(a));
        return ax >= bx ? ax : bx;
    }
}