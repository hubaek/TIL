class Solution {
    public int solution(int num1, int num2) {
        
        // 나누기할때 소수점을 나타내려면 int를 double로 변환해주기
        // 변수에 저장해서 *1000해도 되지만, 식에 바로 * 1000을 해주고,
        // 소수점을 반올림이 아닌 그냥 없애는 거니깐 다시 int 자료형으로 형변환
        double answer = (double)num1 / (double)num2 * 1000;
        
        int result = (int)answer;
        
        return result ;
    }
}