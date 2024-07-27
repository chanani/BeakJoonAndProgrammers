class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String temp = A;
        if(A.equals(B)) return 0;
        for(int i = 0; i < A.length(); i++){
            answer++;
            temp = temp.substring(temp.length() - 1, temp.length()) + temp.substring(0, temp.length() - 1);
            System.out.println(temp);
            if(temp.equals(B)){
                return answer;
            }
        }
        return -1;
    }
}