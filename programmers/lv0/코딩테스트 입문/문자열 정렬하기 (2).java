import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        my_string = my_string.toLowerCase();
        char[] charStr = my_string.toCharArray();
        Arrays.sort(charStr);
        for (char alpha : charStr) {
            answer += alpha;
        }
        return answer;
    }
}
