package dev.kkkkkksssssaaaa.practice.algorithm.lv1;

// 카드뭉치
class CardPakcs {

    public String solution(String[] cards1, String[] cards2, String[] goal) {
        StringBuilder sb = new StringBuilder();
        int cards1Index = 0;
        int cards2Index = 0;

        for (int i = 1; i <= goal.length; i++) {
            if (i % 2 == 0 && cards2Index < cards2.length) {
                sb.append(cards2[cards2Index]);
                cards2Index++;

                while (cards2Index < cards2.length && i + 1 < goal.length && cards2[cards2Index].equals(goal[i ])) {
                    sb.append(cards2[cards2Index]);
                    cards2Index++;
                }
            }

            if (i % 2 != 0 && cards1Index < cards1.length) {
                sb.append(cards1[cards1Index]);
                cards1Index++;

                while (cards1Index < cards1.length && i + 1 < goal.length && cards1[cards1Index].equals(goal[i ])) {
                    sb.append(cards1[cards1Index]);
                    cards1Index++;
                }
            }
        }

        boolean isSame = String.join("", goal).equals(sb.toString());

        if (isSame) {
            return "Yes";
        } else {
            return "No";
        }
    }
}
