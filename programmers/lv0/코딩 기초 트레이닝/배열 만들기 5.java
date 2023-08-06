class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        String answerStr = "";
        for (String intStr : intStrs) {
            int num = Integer.parseInt(intStr.substring(s, s+l));
            if (num > k) {
                if (answerStr.length() != 0) {
                    answerStr += ",";
                }
                answerStr += num;
            } 
        }
        String[] answerStrs = answerStr.split(",");
        answer = new int[answerStrs.length];
        for (int i=0; i<answerStrs.length; i++) {
            answer[i] = Integer.parseInt(answerStrs[i]);
        }
        return answer;
    }
}
