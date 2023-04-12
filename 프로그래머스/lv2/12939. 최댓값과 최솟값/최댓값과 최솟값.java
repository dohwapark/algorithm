class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");
        int[] num = new int[str.length];
        
        for(int i=0; i<num.length; i++) {
            num[i] = Integer.parseInt(str[i]);
        }
        int min = num[0];
        int max = num[0];
        
        for(int i=0; i<num.length; i++) {
            if(num[i] <= min) {
                min = num[i];
            } else if (num[i] >= max) {
                max = num[i];
            }
        }
        answer = min + " " + max;
        
        
        
        return answer;
    }
}