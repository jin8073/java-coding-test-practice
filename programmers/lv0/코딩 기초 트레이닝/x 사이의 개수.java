class Solution {
    public int[] solution(String myString) {
        int[] answer = {};
        String[] xSplit = myString.split("x");
        if (myString.charAt(myString.length()-1) == 'x') {
            answer = new int[xSplit.length+1];
        } else {
            answer = new int[xSplit.length];
        }
        for (int i=0; i<xSplit.length; i++) {
            answer[i] = xSplit[i].length();
        }
        if (myString.charAt(myString.length()-1) == 'x') {
            answer[answer.length-1] = 0;
        }
        return answer;
    }
}
