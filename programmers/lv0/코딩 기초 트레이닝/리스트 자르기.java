class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        switch (n) {
            case 1:
                answer = new int[slicer[1]+1];
                System.arraycopy(num_list, 0, answer, 0, slicer[1]+1);
                break;
            case 2:
                answer = new int[num_list.length-slicer[0]];
                System.arraycopy(num_list, slicer[0], answer, 0, num_list.length-slicer[0]);
                break;
            case 3:
                answer = new int[slicer[1]-slicer[0]+1];
                System.arraycopy(num_list, slicer[0], answer, 0, slicer[1]-slicer[0]+1);
                break;
                
            case 4:
                answer = new int[(slicer[1]-slicer[0])/slicer[2]+1];
                int index = 0;
                for (int i=slicer[0]; i<=slicer[1]; i+=slicer[2]) {
                    answer[index] = num_list[i];
                    index++;
                }
                break;
        }
        return answer;
    }
}
