class Solution {
    boolean solution(String s) {
       return s.toUpperCase()
                .chars()
                .filter(c -> c == 'P')
                .count()
                ==
                s.toUpperCase()
                        .chars()
                        .filter(c -> c == 'Y')
                        .count();
    }
}