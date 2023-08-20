class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        int interval = str1.length();
        for (int i=0; i<str2.length()-str1.length()+1; i++) {
            if (str2.substring(i, i+interval).equals(str1)) {
                return 1;
            }
        }
        return answer;
    }
}
