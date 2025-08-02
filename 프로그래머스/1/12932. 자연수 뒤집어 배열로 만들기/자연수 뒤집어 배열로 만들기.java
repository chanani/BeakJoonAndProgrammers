class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        int[] answer = new int[str.length()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = Math.toIntExact(n % 10);
            n = n / 10;
        }
        
        
        return answer;
    }
}