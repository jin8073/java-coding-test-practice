import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        Arrays.sort(indices);
        int preIndex = -1;
        for (int index : indices) {
            answer += my_string.substring(preIndex+1, index);
            preIndex = index;
        }
        answer += my_string.substring(preIndex+1);
        return answer;
    }
}
