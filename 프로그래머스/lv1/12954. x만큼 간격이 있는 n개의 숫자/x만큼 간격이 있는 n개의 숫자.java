class Solution {
    public long[] solution(int x, int n) {


        long[] answer = new long[n];
        long i = 0;

        for (int j = 1; j <= n; j++) {
            answer[(int)i] = (long) x *j;
            i++;
        }
        return answer;
    }
}