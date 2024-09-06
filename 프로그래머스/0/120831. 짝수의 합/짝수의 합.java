class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=0; i <= n; i++) {
            // i가 짝수이면, answer에 더하기 
            if(i % 2 == 0) {
                answer += i;
            }
        }
        // 다른 풀이 방법 
        // for(int i =0; i <=n; i+=2) {
        // sum +=i;
        // }
        
        return answer;
    }
}