class Solution {
    static int answer;
    
    public static void DFS(int L, int sum, int[] numbers, int target){
        if(L == numbers.length) {
            if(sum == target) answer++;
            return;
        }  else {
            DFS(L + 1, sum + numbers[L], numbers, target);
            DFS(L + 1, sum - numbers[L], numbers, target);
        }
    }
    
    public int solution(int[] numbers, int target) {
        DFS(0, 0, numbers, target);
        return answer;
    }
}