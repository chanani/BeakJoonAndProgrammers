class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        for(int i = 1; i <= count; i++){
            answer += (long) price * i;
        }
        return answer > money ? answer - money : 0;
    }
}