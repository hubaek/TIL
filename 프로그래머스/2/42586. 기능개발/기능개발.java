import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> days = new ArrayList<>();

        for (int i = 0; i < progresses.length; i++) {
            int remaining = 100 - progresses[i];
            int day = (int) Math.ceil((double) remaining / speeds[i]);
            days.add(day);
        }

        List<Integer> result = new ArrayList<>();
        int prev = days.get(0);
        int count = 1;
        for (int i = 1; i < days.size(); i++) {
            if (days.get(i) <= prev) {
                count ++;
            } else {
                result.add(count);
                count = 1;
                prev = days.get(i);
            }
        }
        result.add(count);

        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}