import java.util.*;
class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);

        for (int i = 0; i < citations.length; i++) {
            int count = citations.length - i;
            if (citations[i] >= count) {
                return count;
            }

        }

        return 0;
    }
}