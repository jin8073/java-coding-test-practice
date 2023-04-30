package programmers.lv0;

/**
 * 모음 제거
 * */
public class Problem035 {
    public String solution(String my_string) {
        String answer = "";
        for (char my_char : my_string.toCharArray()) {
            if (my_char != 'a' && my_char != 'e' && my_char != 'i' && my_char != 'o' && my_char != 'u') {
                answer += my_char;
            }
        }
        return answer;
    }
}
