class Solution {
    public boolean solution(int x) {
       int sum = String.valueOf(x).chars().map(ch -> ch - '0').sum();
        return x % sum == 0;
    }
}