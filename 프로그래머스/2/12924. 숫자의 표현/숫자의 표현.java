class Solution {
    public int solution(int n) {
        int count = 0; // 가능한 경우의 수

        for (int m = 1; m * (m - 1) < 2 * n; m++) {
            if ((2 * n - m * (m - 1)) % (2 * m) == 0) {
                count++;
            }
        }
        return count;
    }
}