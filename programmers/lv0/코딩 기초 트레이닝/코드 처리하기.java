class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        for (int idx=0; idx < code.length(); idx++) {
            if (mode == 0) {
                if (code.charAt(idx) != '1') {
                    answer += idx % 2 == 0 ? code.charAt(idx) : "";
                } else {
                    mode = 1;
                }
            } else {
                if (code.charAt(idx) != '1') {
                    answer += idx % 2 == 1 ? code.charAt(idx) : "";
                } else {
                    mode = 0;
                }
            }
        }
        if (answer.length() == 0) {
            answer = "EMPTY";
        }
        return answer;
    }
}
