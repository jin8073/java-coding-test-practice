class Solution {
    public int solution(String num_str) {
        int answer = 0;
        for (int i=0; i<num_str.length(); i++) {
            String numStr = "" + num_str.charAt(i);
            int num = Integer.parseInt(numStr);
            answer += num;
        }
        return answer;
    }
}
