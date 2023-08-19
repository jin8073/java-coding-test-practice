class Solution {
    public String solution(String n_str) {
        String answer = "";
        for (int i=getFirstNotZeroIndex(n_str); i<n_str.length(); i++) {
            answer += n_str.charAt(i);
        }
        return answer;
    }
    
    private int getFirstNotZeroIndex(String n_str) {
        for (int i=0; i<n_str.length(); i++) {
            if (n_str.charAt(i) != '0') {
                return i;
            }
        }
        return -1;
    }
}
