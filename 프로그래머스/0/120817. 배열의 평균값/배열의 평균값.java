class Solution {
    public double solution(int[] numbers) {
        
        double sum = 0;
        
        // 배열의 합을 sum에 저장
        for(int number : numbers) {
            sum += number;
        }
        
        // 배열의 총합을 배열의 길이(총 갯수)로 나눠서 평균값을 구함
        double avg = sum / numbers.length;
        
        return avg;
    }
}