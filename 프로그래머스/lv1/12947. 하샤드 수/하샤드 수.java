class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        String strX = String.valueOf(x);
        String[] str = strX.split("");
        int[] sum = new int[str.length];
        int sumX = 0;

        for (int i = 0; i < str.length; i++) {
            sum[i] = Integer.parseInt(str[i]);
        }
        for (int i = 0; i < sum.length; i++) {
            sumX += sum[i];
        }

        if (x % sumX == 0) {
            answer = true;
        }
        return answer;
    }
}