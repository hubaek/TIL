class Solution {
    public long[] solution(long x, int n) {
        // 배열 크기는 n개 출력으로 정해져있으므로
        // 컬렉션을 안쓰고, 배열로 활용
        long[] answer = new long[n];
        
        for (int i = 1; i <= n; i++) {
            // x에서 시작해서 x씩 증가하므로 x*1,2,3...
            // 배열인덱스를 [0]부터 넣어야해서 i-1, 곱하기를 해야돼서 i=1부터 시작
            answer[i-1] = x * i;
        }
        
        return answer;
    }
}