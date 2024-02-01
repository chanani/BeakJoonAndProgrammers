class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        // x * y = brown + yellow
        // x + y = brown / 2 + 2
        // x >= y
        // yellow = x * y - brown
        // y = (brown / 2) + 2 - x;
        
        int x = 1;
        while(true){
            int y = (brown / 2) + 2 - x;
            if(x * y - brown == yellow){
                answer[0] = y;
                answer[1] = x;
                break;
            }
            x++;
        }
        
        
        return answer;
    }
}