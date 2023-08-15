import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] splitArr = myString.split("x");
        Arrays.sort(splitArr);
        int count = 0;
        while (splitArr[count].length() == 0) {
            count++;
        }
        String[] answer = new String[splitArr.length-count];
        System.arraycopy(splitArr, count, answer, 0, answer.length);
        return answer;
    }
}
