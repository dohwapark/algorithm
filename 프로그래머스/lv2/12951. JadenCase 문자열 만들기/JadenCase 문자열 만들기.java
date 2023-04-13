class Solution {
    public String solution(String s) {
        String answer = "";
        String last;
        String[] str = s.split(" ");
        
        for(int i=0; i<str.length; i++) {
            try {
                if (i != str.length -1) {
                    answer += str[i].substring(0, 1).toUpperCase();
                    answer += str[i].substring(1).toLowerCase();
                    answer += " ";
                } else {
                    answer += str[i].substring(0, 1).toUpperCase();
                    answer += str[i].substring(1).toLowerCase();
                }
            } catch (Exception e) {
                answer += str[i];
                answer += " ";
            }
        }
        for (int i=s.length(); i>=0; i--) {
            last = s.substring(i-1, i);
            if (last.equals(" ")) {
                answer += " ";
            } else {
                return answer;
            }
        }
        return answer;
    }
}