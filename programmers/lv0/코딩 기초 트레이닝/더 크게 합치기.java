import java.lang.Math;

class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int ab = a * (int)Math.pow(10, getNumberLength(b)) + b;
        int ba = b * (int)Math.pow(10, getNumberLength(a)) + a;
        if (ab >= ba) {
            answer = ab;
        } else {
            answer = ba;
        }
        return answer;
    }
    
    private int getNumberLength(int num) {
        int numberLength = 0;
        while (num != 0) {
            numberLength += 1;
            num /= 10;
        }
        return numberLength;
    }
}
