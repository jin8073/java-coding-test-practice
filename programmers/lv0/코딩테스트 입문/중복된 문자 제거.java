class Solution {
    public String solution(String my_string) {
        String answer = "";
        int[] count = new int[53];
        for (int i=0; i<my_string.length(); i++) {
            if (my_string.charAt(i) == ' ') {
                if (count[0] == 0) {
                    answer += my_string.charAt(i);
                    count[0] += 1;
                }
            } else if (my_string.charAt(i) >= 65 && my_string.charAt(i) <= 90) {
                if (count[(int) my_string.charAt(i) - 64] == 0) {
                    answer += my_string.charAt(i);
                    count[(int) my_string.charAt(i) - 64] += 1;
                }
            } else {
                if (count[(int) my_string.charAt(i) - 70] == 0) {
                    answer += my_string.charAt(i);
                    count[(int) my_string.charAt(i) - 70] += 1;
                }
            }
        }
        return answer;
    }
}
