class Solution {
    public int solution(String[] strArr) {
        int[] size = new int[30];
        int answer = 0;
        for (int i=0; i<strArr.length; i++) {
            size[strArr[i].length()-1] += 1;
        }
        for (int i=0; i<size.length; i++) {
            answer = answer > size[i] ? answer : size[i];
        }
        return answer;
    }
}
