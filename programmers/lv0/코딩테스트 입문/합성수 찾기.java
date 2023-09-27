class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i=2; i<=n; i++) {
            answer += getCount(i);
        }
        return answer;
    }
    
    private int getCount(int number) {
        for (int i=2; i<number; i++) {
            if (number % i == 0) {
                    return 1;
            }
        }
        return 0;
    }
}
