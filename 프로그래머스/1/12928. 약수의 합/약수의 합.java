import java.util.stream.*;
class Solution {
    public int solution(int n) {
       return IntStream.rangeClosed(1, n)
                        .filter(i -> n % i == 0)
                        .sum();
    }
}