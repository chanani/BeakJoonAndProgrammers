import java.util.Arrays;
class Solution {
    public String solution(String[] str_list, String ex) {
        StringBuilder sb = new StringBuilder();
        Arrays.stream(str_list)
                .filter(str -> !str.contains(ex))
                .forEach(sb::append);
        return sb.toString();
    }
}