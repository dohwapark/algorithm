class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] str = s.split("");

        for (int i = 1; i < str.length; i++) {
            str[0] = str[0] + str[i];
        }
        answer = Integer.parseInt(str[0]);
        return answer;
    }
}