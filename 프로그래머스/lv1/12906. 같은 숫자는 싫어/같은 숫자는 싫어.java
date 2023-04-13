import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer;
        
        Queue<Integer> num = new LinkedList<>();
        
        num.offer(arr[0]);
        for(int i=1; i<arr.length; i++) {
            if (arr[i-1] != arr[i]) {
                num.offer(arr[i]);
            }
        }
        int size = num.size();
        answer = new int[size];
        
        for (int i=0; i<answer.length; i++) {
            answer[i] = num.poll();
        }
        

        return answer;
    }
}