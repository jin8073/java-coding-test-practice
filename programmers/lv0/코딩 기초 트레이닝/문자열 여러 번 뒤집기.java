class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        for (int i=0; i<queries.length; i++) {
            String str = "";
            for(int j=queries[i][1]; j>=queries[i][0]; j--) {
                str += my_string.charAt(j);
            }
            my_string = my_string.substring(0, queries[i][0]) + str + my_string.substring(queries[i][1]+1);
        }
        answer = my_string;
        return answer;
    }
}
