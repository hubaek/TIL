import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        HashSet<Integer> set = new HashSet<Integer>();
        
        // 각 종류의 포켓몬을 set에 담는다. 
        for (int i = 0; i < nums.length; i++) {
                set.add(nums[i]);
        }
        
        // for (int i = 0; i < nums.length; i++) {
        //     if(!(set.contains(nums[i]))) {
        //         set.add(nums[i]);
        //     }
        // }
        
        // n/2마리를 가져가야함 
        if (set.size() > nums.length/2) {
            answer = nums.length/2;
        } else {
            answer = set.size();
        }
        
        return answer;
    }
}