/**
 * 문자열 뒤집기
 * */
class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] my_strings = my_string.toCharArray();
        for (int i = my_strings.length-1; i >= 0; i--) {
            answer += my_strings[i];
        }
        return answer;
    }
}
