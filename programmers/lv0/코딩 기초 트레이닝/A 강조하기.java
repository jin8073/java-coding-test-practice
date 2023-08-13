class Solution {
    public String solution(String myString) {
        String answer = "";
        for (int i=0; i<myString.length(); i++) {
            if (myString.charAt(i) == 97 || myString.charAt(i) == 65) {
                answer += 'A';
            } else if (myString.charAt(i) <= 90 && myString.charAt(i) >= 66) {
                char lowerAlpha = (char) (myString.charAt(i) + 32);
                answer += lowerAlpha;
            } else {
                answer += myString.charAt(i);
            }
        }
        return answer;
    }
}
