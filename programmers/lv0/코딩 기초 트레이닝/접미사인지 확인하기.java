class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        String[] suffixes = new String[my_string.length()];
        for (int i=0; i<my_string.length(); i++) {
            suffixes[i] = my_string.substring(i);
        }
        for (String suffix : suffixes) {
            if (is_suffix.equals(suffix)) {
                answer = 1;
            }
        }
        return answer;
    }
}
