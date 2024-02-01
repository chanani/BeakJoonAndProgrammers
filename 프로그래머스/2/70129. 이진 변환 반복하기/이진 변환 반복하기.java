class Solution {
    public int[] solution(String s) {
        // answer : 0 = 변환 힛수, 1 = 제거된 0의 개수
        int[] answer = new int[2]; 
        
        int c = 0;
        while(c != 1){
            c = s.length();
            s = s.replaceAll("0", ""); // 0의 자리 제거
            answer[1] += c - s.length(); // 제거한 0의 수를 더해줌
            s = Integer.toString(s.length(), 2);
            answer[0]++;
            c = s.length();
        }
        
        
        return answer;
    }
}