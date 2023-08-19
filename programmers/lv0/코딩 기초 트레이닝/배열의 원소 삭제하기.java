class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};
        int[] container = new int[arr.length];
        int count = 0;
        for (int i=0; i<arr.length; i++) {
            if (!isExist(arr[i], delete_list)) {
                container[count] = arr[i];
                count++;
            }
        }
        answer = new int[count];
        System.arraycopy(container, 0, answer, 0, count);
        return answer;
    }
    
    private boolean isExist(int element, int[] delete_list) {
        for (int i=0; i<delete_list.length; i++) {
            if (element == delete_list[i]) {
                return true;
            }
        }
        return false;
    }
}
