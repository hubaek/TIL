class Solution {
    public int solution(int n) {
        int answer;
        
        
        for(answer = 1; answer <=n; answer++) {
            // 자연수 n 나머지 x(answer) == 1을 조건문으로 적어주고 반복문에 넣어주면 가장 작은 자연수 x가 나옴.
            // else를 붙여주면 바로 else문으로 return되기 때문에 붙여주면 안됨
            if(n % answer == 1) {
                return answer;
            } 
        }
        // 마지막에 리턴문도 써줘야 함 
        return answer;
        
    }
}