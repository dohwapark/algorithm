class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer2 = new int[privacies.length];
        int count =0;

        int year = Integer.parseInt(today.substring(0,4)); // 오늘의 연도
        int month = Integer.parseInt(today.substring(5, 7)); // 오늘의 월
        int day = Integer.parseInt(today.substring(8, 10)); // 오늘의 일


        for (int i = 0; i < privacies.length; i++) {
            char p = privacies[i].charAt(11); // 고객의 약관
            for (int j = 0; j < terms.length; j++) {
                char t = terms[j].charAt(0); // 약관 종류
                if (p==t){                  // 고객의 약관 == 약관 종류
                    int a = Integer.parseInt(privacies[i].substring(0,4)); // 고객의 가입연도
                    int b = Integer.parseInt(privacies[i].substring(5,7)); // 고객의 가입월
                    int c = Integer.parseInt(privacies[i].substring(8,10)); // 고객의 가입일

                    int d = Integer.parseInt((terms[j].substring(2))); // 약관의 유효개월

                    int e = b+d; // 고객의 가입월 + 약관의 유효 개월

                    if (e>12){
                        if(e%12==0){
                            int f = a+(e/12)-1;
                            int g = 12;
                            if(f<year){ // 가엽연도+(고객의 가입월 + 약관의 유효개월) < 오늘의 연도
                                answer2[i]=i+1;
                                count +=1;
                            } else if (f==year && g<month) {
                                answer2[i]=i+1;
                                count +=1;
                            } else if (f==year && g==month && c<=day) {
                                answer2[i]=i+1;
                                count +=1;
                            }
                        }else{
                            int f = a+(e/12);
                            int g = e%12;
                            if(f<year){ // 가엽연도+(고객의 가입월 + 약관의 유효개월) < 오늘의 연도
                                answer2[i]=i+1;
                                count +=1;
                            } else if (f==year && g<month) {
                                answer2[i]=i+1;
                                count +=1;
                            } else if (f==year && g==month && c<=day) {
                                answer2[i]=i+1;
                                count +=1;
                            }
                        }
//                        int f = a+(e/12);
//                        int g = e%12;
                        
                    } else {
                        if(a<year){
                            answer2[i]=i+1;
                            count +=1;
                        } else if (a==year && e<month) {
                            answer2[i]=i+1;
                            count +=1;
                        } else if (a==year && e==month && c<=day) {
                            answer2[i]=i+1;
                            count +=1;
                        }
                    }
                }
            }
        }
        int[] answer = new int[count];
        int k = 0;
        for (int i = 0; i < answer2.length; i++) {
            if(answer2[i] != 0){
                answer[k]=answer2[i];
                k++;
            }

        }
        return answer;
    }
}