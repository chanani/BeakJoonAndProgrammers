class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        String[] arr = code.split("");
        for(int i = 0; i < code.length(); i++){
            if(mode == 0){
                if(!arr[i].equals("1") && i % 2 == 0) answer += arr[i];
                if(arr[i].equals("1")) mode = 1;
            } else {
                if(!arr[i].equals("1") && i % 2 != 0) answer += arr[i];
                if(arr[i].equals("1")) mode = 0;
            }
        }
        if(answer == "") return "EMPTY";
        return answer;
    }
}