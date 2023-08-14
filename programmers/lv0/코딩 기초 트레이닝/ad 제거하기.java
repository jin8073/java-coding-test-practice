class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        String[] answerArr = new String[strArr.length];
        int count = 0;
        for(int i=0; i<strArr.length; i++) {
            if (!strArr[i].contains("ad")) {
                answerArr[count] = strArr[i];
                count++;
            }
        } 
        answer = new String[count];
        System.arraycopy(answerArr, 0, answer, 0, count);
        return answer;
    }
}
