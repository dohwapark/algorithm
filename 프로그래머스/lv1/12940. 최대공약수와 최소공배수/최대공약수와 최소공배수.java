class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int max;
        
        
        if (n > m) {
            max = n;
        } else {
            max = m;
        }
        
        answer[0] = 1;
        
        for (int i=max; i>=2; i--) {
            if (n % i == 0 && m % i == 0) {
                answer[0] = i;
                break;
            }
        }
        
        answer[1] = answer[0] * n/answer[0] * m/answer[0];
        
        
        return answer;
    }
}