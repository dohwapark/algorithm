class Solution {
    boolean solution(String s) {
        int countP = 0;
        int countY = 0;

        boolean answer = false;

        String[] str = s.split("");
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("p") || str[i].equals("P")) {
                countP += 1;
            } else if (str[i].equals("y") || str[i].equals("Y")) {
                countY += 1;
            }
        }
        if (countP == countY) {
            answer = true;
        } else if (countP == 0 || countY == 0) {
            answer = false;
        }

        return answer;
    }
}