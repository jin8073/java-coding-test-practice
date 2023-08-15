class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String patReverse = "";
        for (int i=0; i<pat.length(); i++) {
            if (pat.charAt(i) == 'A') {
                patReverse += 'B';
            } else {
                patReverse += 'A';
            }
        }
        for (int i=0; i<myString.length()-pat.length()+1; i++) {
            if(myString.substring(i, i+pat.length()).equals(patReverse)) {
                return 1;
            }
        }
        return answer;
    }
}
