class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        String preStr = "";
        for (int i=0; i<myString.length()-pat.length()+1; i++) {
            if (myString.substring(i, i+pat.length()).equals(pat)) {
                preStr += pat;
                answer = preStr.length() < answer.length() ? answer : preStr;
            } else {
                preStr += myString.charAt(i);
            }
        }
        return answer;
    }
}
