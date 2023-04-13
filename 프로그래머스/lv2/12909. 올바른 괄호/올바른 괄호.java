class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int count = 0;
        String[] str = s.split("");
        
        if (str[0].equals("(")) {
            for (int i=0; i<str.length; i++) {
                if (count < 0) {
                    return answer = false;
                } else if (str[i].equals(")")) {
                    count -= 1;
                } else if (str[i].equals("(")) {
                    count += 1;
                }
            } 
            if (count != 0) {
                return answer = false;
            }
        } else {
            answer = false;
        }
        

        return answer;
    }
}