import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] frequency = new int[100];
        int[] numbers = new int[100];
        int count = 0;
        int index = 0;
        Arrays.sort(array);
        for (int i=0; i<array.length; i++) {
            if (i != 0) {
                if (array[i] != array[i-1]) {
                    frequency[index] = count;
                    numbers[index] = array[i-1];
                    index++;
                    count = 0;
                }
            }
            count++;
        }
        frequency[++index] = count;
        numbers[index] = array[array.length-1];
        int max1 = 0;
        int max2 = 0;
        int index1 = 0;
        int index2 = 0;
        for (int i=0; i<100; i++) {
            if (max1 < frequency[i]) {
                max2 = max1;
                index2 = index1;
                max1 = frequency[i];
                index1 = i;
            } else if (max2 < frequency[i]) {
                max2 = frequency[i];
                index2 = i;
            }
        }
        if (max1 == max2) {
            answer = -1;
        } else {
            answer = max1 > max2 ? numbers[index1] : numbers[index2];
        }
        return answer;
    }
}
