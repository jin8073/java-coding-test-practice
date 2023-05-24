class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String ab_str = a + "" + b;
        int ab = Integer.parseInt(ab_str);
        int ab2 = 2 * a * b;
        answer = ab >= ab2 ? ab : ab2; 
        return answer;
    }
}
