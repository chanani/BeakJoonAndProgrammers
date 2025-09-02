import java.math.*;
class Solution {
    public String solution(String a, String b) {
        BigInteger i = new BigInteger(a);
        BigInteger j = new BigInteger(b);

        return i.add(j).toString();

    }
}