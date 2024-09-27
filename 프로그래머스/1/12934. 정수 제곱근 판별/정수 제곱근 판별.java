class Solution {
    public long solution(long n) {
        long answer = 0;
        
        // n의 제곱근을 반환하는 식 Math.sqrt(n)
        double sqrt = Math.sqrt(n);
        
        // MAth.floor(sqrt) sqrt를 내림해서 sqrt가 정수인지 확인 
        if(sqrt == Math.floor(sqrt)) {
            answer = (long) Math.pow(sqrt+1,2);
            return answer;
        } else {
            answer = -1;
            return answer;
        }
        
        
    }
}