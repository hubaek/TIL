class Solution {
    public int solution(int n) {
        int answer = 0;
        int m = n + 1;
        
         while (true) {
            String binaryN = Integer.toBinaryString(n);
            String binaryM = Integer.toBinaryString(m);
            int countN = 0;
            int countM = 0;

            for (int i = 0; i < binaryN.length(); i++) {
                if (binaryN.charAt(i) == '1') {
                    countN++;
                }
            }

            for (int i = 0; i < binaryM.length(); i++) {
                if (binaryM.charAt(i) == '1') {
                    countM++;
                }
            }

            if (countN == countM) {
                answer = m;
                break;
            } else {
                m++;
            }
         }
        
        return answer;
    }
}