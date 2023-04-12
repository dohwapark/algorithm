class Solution {
    public String solution(String s) {
        String answer = "";
        int count = s.length();
        int center = 0;
        
        if (count % 2 == 0) {
            center = count/2;
            String sub = s.substring(center-1, center+1);
            answer = sub;
        } else {
            center = count/2 + 1;
            String sub = s.substring(center-1, center);
            answer = sub;
        }
        
        
        return answer;
    }
}