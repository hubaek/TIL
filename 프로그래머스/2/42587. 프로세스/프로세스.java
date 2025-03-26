import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.add(new int[]{i, priorities[i]});
        }

        int order = 0;
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            boolean hasHigherPriority = false;

            // 우선순위 더 높은 프로세스가 있는지 직접 반복문으로 체크
            for (int[] q : queue) {
                if (q[1] > current[1]) {
                    hasHigherPriority = true;
                    break;
                }
            }

            if (hasHigherPriority) {
                queue.add(current); // 다시 뒤로 보냄
            } else {
                order++;
                if (current[0] == location) {
                    return order;
                }
            }
        }
        return -1;
    }
}