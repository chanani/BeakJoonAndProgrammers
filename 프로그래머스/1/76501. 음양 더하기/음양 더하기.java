import java.util.*;
import java.util.stream.*;
class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
         return IntStream.range(0, absolutes.length)
                .map(i -> signs[i] ? absolutes[i] : -absolutes[i])
                .sum();
    }
}