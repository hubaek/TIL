import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while(n != 0) {
            // 987%10 7을 추출, 10으로 나누면 98. 98%10 = 8, 10으로 나누면 9
            answer += (n % 10);
            n = n/10;
        }

        return answer;
    }
}