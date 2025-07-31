import java.util.*;
import java.util.function.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        return Arrays.stream(strings)
               .sorted(Comparator.comparingInt((String s) -> s.charAt(n))
                        .thenComparing(Comparator.naturalOrder()))
                .toArray(String[]::new);
    }
}