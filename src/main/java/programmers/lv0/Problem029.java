package programmers.lv0;

/**
 * 특정 문자 제거하기
 * */
public class Problem029 {
    public String solution(String my_string, String letter) {
        String answer = "";
        for (char my_char : my_string.toCharArray()) {
            String compareLetter = "" + my_char;
            if (!compareLetter.equals(letter)) {
                answer += compareLetter;
            }
        }
        return answer;
    }
}
