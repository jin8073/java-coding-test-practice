package programmers.lv0;

/**
 * 문자열 뒤집기
 * */
public class Problem022 {
    public String solution(String my_string) {
        String answer = "";
        char[] my_strings = my_string.toCharArray();
        for (int i = my_strings.length-1; i >= 0; i--) {
            answer += my_strings[i];
        }
        return answer;
    }
}
