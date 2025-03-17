import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {};
        HashSet<String> set = new HashSet<>();

        set.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            String prevWord = words[i - 1]; // 이전 단어
            String currWord = words[i]; // 현재 단어

            // 1. 중복된 단어 검사
            if (set.contains(currWord)) {
                return new int[]{(i % n) + 1, (i / n) + 1}; // 탈락자 반환
            }

            // 2. 끝말잇기 규칙 검사
            if (prevWord.charAt(prevWord.length() - 1) != currWord.charAt(0)) {
                return new int[]{(i % n) + 1, (i / n) + 1}; // 탈락자 반환
            }

            // 3. 단어 길이가 1이면 불가능
            if (currWord.length() < 2) {
                return new int[]{(i % n) + 1, (i / n) + 1};
            }

            set.add(currWord); // 중복 확인을 위해 추가
        }

        return new int[]{0, 0}; // 탈락자 없음
    }
}