import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        Arrays.sort(num_list);
        answer = Arrays.copyOfRange(num_list,0,5);
        return answer;
    
        // return Arrays.stream(num_list)
        //         .sorted()
        //         .limit(5)
        //         .toArray();
    }
}