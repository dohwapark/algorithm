import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int count = 0;
        int number = 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] % divisor == 0) {
                count += 1;
            }
        }
        int[] answer = new int[count];
        if (count == 0) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            Arrays.sort(arr);
            for(int i=0; i<arr.length; i++) {
                if (arr[i] % divisor == 0) {
                answer[number] = arr[i];
                number += 1;
                }
            }
        }
        return answer;
    }
}