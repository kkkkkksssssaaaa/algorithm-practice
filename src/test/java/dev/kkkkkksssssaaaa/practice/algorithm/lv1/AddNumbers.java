package dev.kkkkkksssssaaaa.practice.algorithm.lv1;

// 자릿수 더하기
class AddNumbers {

    public int solution(int n) {
        int sum = 0;
        String numberToString = String.valueOf(n);

        for (int i = 0; i < numberToString.length(); i++) {
            sum += Integer.parseInt(numberToString.substring(i, (i + 1)));
        }

        return sum;
    }
}
