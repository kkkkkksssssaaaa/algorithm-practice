package dev.kkkkkksssssaaaa.practice.algorithm.lv1;

// 서울에서 김서방 찾기
class FindKimInSeoul {

    public String solution(String[] seoul) {
        String answerFormat = "김서방은 %d에 있다";
        String kim = "Kim";

        String answer = "";

        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals(kim)) {
                answer = String.format(answerFormat, i);
                i = seoul.length;
            }
        }

        return answer;
    }
}
