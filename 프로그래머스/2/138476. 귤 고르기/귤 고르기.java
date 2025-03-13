import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> countGyulSize = new HashMap<>();

        for (int num : tangerine) {
            countGyulSize.put(num, countGyulSize.getOrDefault(num, 0) + 1);
        }
        List<Integer> countList = new ArrayList<>(countGyulSize.values());
        countList.sort(Collections.reverseOrder());

        for (int count : countList) {
            k -= count;
            answer ++;
            if (k <=0) {
                break;
            }
        }
        return answer;
    }
}