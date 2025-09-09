class Solution {
    public String solution(String my_string, int s, int e) {
        String base = my_string.substring(s, e + 1);
        StringBuilder reverse = new StringBuilder(base).reverse();
        return my_string.replace(base, reverse.toString());
    }
}