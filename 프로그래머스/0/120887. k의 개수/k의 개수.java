class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String y = String.valueOf(k);
        for(int a = i; a <= j; a++){
            String x = String.valueOf(a);
            if(x.contains(y)) {
                String[] str = x.split("");
                for(int b = 0; b < str.length; b++){
                    if(str[b].equals(y)) answer++;
                }
            }
        }
        return answer;
    }
}