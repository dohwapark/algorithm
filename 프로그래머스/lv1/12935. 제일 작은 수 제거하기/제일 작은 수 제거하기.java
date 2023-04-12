import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int min;
        int num = 0;
        
        if (arr.length == 1) {
            int[] answer = new int[1];
            answer[0] = -1;
            return answer;
        } else {
            int[] answer = new int[arr.length - 1];
            min = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] <= min) {
                    min = arr[i];
                    num = i;
                }
            }
            for (int i = 0; i < answer.length; i++) {
                if(i<num){
                    answer[i] = arr[i];
                } else if (i>=num) {
                    answer[i] = arr[i+1];
                }
            }
            return answer;
        }
    }
}