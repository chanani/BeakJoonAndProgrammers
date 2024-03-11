
import java.util.*;
class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int hIndex = 0;
        for(int i = citations.length - 1; i >= 0; i--) {
            int h = Math.min(citations[i], citations.length - i);
            hIndex = Math.max(hIndex, h);
        }
        return hIndex;
    }
}