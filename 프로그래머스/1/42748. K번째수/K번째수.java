import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int idx = 0; idx < commands.length; idx++) {
            int i = commands[idx][0];   // 시작 인덱스
            int j = commands[idx][1];   // 끝 인덱스
            int k = commands[idx][2];   // k번째 수

            int[] slicedArray = Arrays.copyOfRange(array, i-1, j);
            Arrays.sort(slicedArray);
            answer[idx] = slicedArray[k-1];

        }
        
        return answer;
    }
}