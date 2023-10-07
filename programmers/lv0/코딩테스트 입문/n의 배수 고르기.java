class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        int[] num = new int[numlist.length];
        int count = 0;
        for (int i=0; i<numlist.length; i++) {
            if (numlist[i] % n == 0) {
                num[count++] = numlist[i];
            }
        }
        answer = new int[count];
        System.arraycopy(num, 0, answer, 0, count);
        return answer;
    }
}
