class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String number = "0";
        for (int i=0; i<my_string.length(); i++) {
            if (my_string.charAt(i) >= 48 && my_string.charAt(i) <= 57) {
                number += my_string.charAt(i);
            } else {
                answer += Integer.parseInt(number);
                number = "0";
            }
        }
        if (!number.equals("0")) {
            answer += Integer.parseInt(number);
        }
        return answer;
    }
}
