class Solution {
    public int solution(String number) {
        int sum = 0;
        for (String num : number.split("")) {
            sum += Integer.parseInt(num);
        }
        return sum % 9;
    }
}