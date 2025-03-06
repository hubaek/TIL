class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean isSpace = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                sb.append(' ');
                isSpace = true;
            } else {
                if (isSpace){
                    sb.append(Character.toUpperCase(s.charAt(i)));
                    isSpace = false;
                } else {
                    sb.append(Character.toLowerCase(s.charAt(i)));
                }
            }
        }
        
        return sb.toString();
    }
}