import java.util.Arrays;
class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        int sumCount0 = 0;
        int sumCountEzin = 0;
        
        while(true) {
            if (s.equals("1")) {
                break;
            }
            int countEzin = 0;
            int count0 = s.length() - s.replaceAll("0","").length();
            sumCount0 += count0;
            String temp = s.replaceAll("0", "");
            
            s = Integer.toBinaryString(temp.length());
            countEzin++;
            sumCountEzin += countEzin;
            
            answer = new int[]{sumCountEzin, sumCount0};
            
        }
        
        return answer;
    }
}