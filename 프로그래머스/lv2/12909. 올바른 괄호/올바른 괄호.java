import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        Stack<Character> Stack = new Stack<>();
        
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                Stack.push(c);
            } else if (c == ')') {
                if (Stack.size() == 0) {
                    return answer = false;
                } else {
                    Stack.pop();
                }
            }
        }
        if (Stack.size() != 0) {
            answer = false;
        }
        
        
        

        return answer;
    }
}