class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer = {};
        if (arr.length > arr[0].length) {
            answer = new int[arr.length][arr.length];
            for (int i=0; i<answer.length; i++) {
                for (int j=0; j<answer[i].length; j++) {
                    if (j >= arr[i].length) {
                        answer[i][j] = 0;
                    } else {
                        answer[i][j] = arr[i][j];
                    }
                }
            } 
        } else if (arr.length < arr[0].length) {
            answer = new int[arr[0].length][arr[0].length];
            for (int i=0; i<answer.length; i++) {
                for (int j=0; j<answer[i].length; j++) {
                    if (i >= arr.length) {
                        answer[i][j] = 0;
                    } else {
                        answer[i][j] = arr[i][j];
                    }
                }
            } 
        } else {
            answer = arr;
        }
        return answer;
    }
}
