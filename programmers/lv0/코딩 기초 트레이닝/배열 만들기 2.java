class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        String answerStr = "";
        while (l % 5 != 0) {
            l++;
        }
        for (int i=l; i<=r; i+=5) {
            int num = i;
            while (num > 0) {
                if (num % 5 != 0) {
                    break;
                }
                num /= 10;
            }
            if (num == 0) {
                if (answerStr.length() != 0) {
                    answerStr += ",";
                }
                answerStr += i;
            }
        }
        if (answerStr.length() != 0) {
            String[] strArr = answerStr.split(",");
            answer = new int[strArr.length];
            for (int i=0; i<strArr.length; i++) {
                answer[i] = Integer.parseInt(strArr[i]);
            }
        } else {
            answer = new int[] {-1};
        }
        return answer;
    }
}
