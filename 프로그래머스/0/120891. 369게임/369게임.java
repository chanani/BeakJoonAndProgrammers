class Solution {
    public int solution(int order) {
        int answer = 0;
        String str = String.valueOf(order);
        for(String x : str.split("")){
            if(x.equals("3") || x.equals("6") || x.equals("9")) answer++;
        }
        return answer;
    }
}