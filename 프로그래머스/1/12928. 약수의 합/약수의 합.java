class Solution {
    public int solution(int n) {
        int answer = 0;
        // 처음엔 n/i로 생각했는데 그러면 나머지가 나와서 모든 수가 나와서 약수를 고를 수 없음 
        // n % i == 0 일때, 나머지가 있으면 그것은 약수가 아니다.
        
        for(int i = 1; i <= n ; i++) {
            if(n % i == 0) {
                answer += i;
            }
        }
        
        return answer;
    }
}