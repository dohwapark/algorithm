class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        while (s.length() > 1) {
            int next = 0;
            for(int i=0; i<s.length(); i++) {
                if (s.charAt(i) == '0') {
                    answer[1] += 1;
                } else {
                    next += 1;
                }
            }
            s = Integer.toBinaryString(next);
            answer[0] += 1;
        }
        
        return answer;
    }
}