import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char[] beforeCharacter = before.toCharArray();
        char[] afterCharacter = after.toCharArray();
        Arrays.sort(beforeCharacter);
        Arrays.sort(afterCharacter);
        if (Arrays.equals(beforeCharacter, afterCharacter)) {
            answer = 1;
        }
        return answer;
    }
}
