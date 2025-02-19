class Solution {
    public String solution(String[] arr) {
        String answer = "";
        // StringBuilder answer = new StringBuilder();

        for (String s : arr) {
            System.out.print(s);
            answer += s;
            // answer.append(s);

        }
        return answer;
    }
}