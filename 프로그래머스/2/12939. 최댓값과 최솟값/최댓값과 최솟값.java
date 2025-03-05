class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        
        int max = Integer.parseInt(arr[0]);
        int min = Integer.parseInt(arr[0]);
        
        for (String num : arr) {
            int value = Integer.parseInt(num);
            if (value > max) {
                max = value;
            }
            if (value < min) {
                min = value;
            }
        }
        answer = min + " " + max;
        
        return answer;
    }
}