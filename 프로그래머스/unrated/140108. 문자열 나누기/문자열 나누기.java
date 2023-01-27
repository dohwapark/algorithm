class Solution {
    public int solution(String s) {

        String[] str = s.split("");
        int sum1 = 0;
        int sum2 = 0;
        int count = 0;
        int answer = 1;

        for (int i = 0; i < str.length; i++) {
            if (str[count].equals(str[i])) {
                System.out.println(str[count]);
                sum1 += 1;
            } else {
                sum2 += 1;
            }
            if (sum1 == sum2) {
                answer +=1;
                count = sum1 + sum2;
                if (count == str.length) {
                    answer -= 1;
                }
            }
        }
        if (answer == 0){
            answer = 1;
        }
        return answer;
    }
}