class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (int i=0; i<my_string.length(); i++) {
            if (my_string.charAt(i) <= 90) {
                char temp = (char) (my_string.charAt(i) + 32);
                answer = answer + temp;
            } else {
                char temp = (char) (my_string.charAt(i) - 32);
                answer = answer + temp;
            }
        }
        return answer;
    }
}
