import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String rsp) {
        return Arrays.stream(rsp.split(""))
                .map(s -> switch (s) {
                    case "2" -> "0";
                    case "0" -> "5";
                    case "5" -> "2";
                    default -> s;
                })
                .collect(Collectors.joining());
    }
}