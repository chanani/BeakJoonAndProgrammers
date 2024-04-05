class Solution {
    public int[] solution(String myString) {
        int size = 0, count = 0, s = 0;
        for(char x : myString.toCharArray()){
            if(x == 'x') size++;
        }
        int[] answer = new int[size + 1];
        for(int i = 0; i < myString.length(); i++) {
            if(i == myString.length() - 1) {
                if(myString.charAt(i) == 'x') answer[s] = count;
                else answer[s] = ++count;
            } else if(myString.charAt(i) == 'x'){
                answer[s++] = count;
                count = 0;
            } else if(myString.charAt(i) != 'x') count++;
        }
        
        return answer;
    }
}