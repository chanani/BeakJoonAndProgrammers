import java.util.*;
class Solution {
    public String[] solution(String[] strArr) {
       return Arrays.stream(strArr)
                .filter(str -> !str.contains("ad"))
                .toArray(String[]::new);
    }
}