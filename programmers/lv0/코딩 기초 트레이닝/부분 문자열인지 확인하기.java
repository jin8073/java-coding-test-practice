class Solution {
    public int solution(String my_string, String target) {
        int answer = 0;
        int interval = target.length();
        for (int i=0; i<my_string.length()-interval+1; i++) {
            if (my_string.substring(i, i+interval).equals(target)) {
                return 1;
            }
        }
        return answer;
    }
}
