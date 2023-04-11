class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int num = phone_number.length();
        String sub = phone_number.substring(num - 4);
        
        for (int i=0; i<num -4; i++) {
            answer += "*";
        }
        
        answer += sub;
        
        return answer;
    }
}