class Solution {
    public int solution(int n) {
        int answer = 0;
        if (n % 2 == 0) {
            answer = getEvenSquareSum(n);
        } else {
            answer = getOddSum(n);
        }
        return answer;
    }
    
    private int getOddSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n;
            n-= 2;
        }
        return sum;
    }
    
    private int getEvenSquareSum(int n) {
        int sum = 0;
        while (n> 0) {
            sum += n*n;
            n -= 2;
        }
        return sum;
    }
}
