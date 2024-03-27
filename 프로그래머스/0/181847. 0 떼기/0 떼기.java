class Solution {
    public String solution(String n_str) {
        
        while(n_str.substring(0,1).equals("0")){
            n_str = n_str.substring(1,n_str.length());
            System.out.println(n_str);
        }
        return n_str;
    }
}