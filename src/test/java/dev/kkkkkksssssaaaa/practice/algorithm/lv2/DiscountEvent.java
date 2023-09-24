package dev.kkkkkksssssaaaa.practice.algorithm.lv2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 할인 행사
class DiscountEvent {

    @Test
    void doTest() {
        assertEquals(
            3,
            solution(
                new String[]{"banana", "apple", "rice", "pork", "pot"},
                new int[]{3, 2, 2, 2, 1},
                new String[]{"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"}
            )
        );

        assertEquals(
            0,
            solution(
                new String[]{"apple"},
                new int[]{10},
                new String[]{"banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana"}
            )
        );
    }

    public int solution(String[] want, int[] number, String[] discount) {
        int count = 0;

        List<String> wishList = new ArrayList<>();

        for (int i = 0; i < want.length; i++) {
            for (int j = 0; j < number[i]; j++) {
                wishList.add(want[i]);
            }
        }

        // 10일간 회원 자격 부여
        for (int i = 0; i < discount.length - 9; i++) {
            System.out.println("");
            System.out.println("회원 자격 시작일 = " + (i + 1));
            boolean isAllContains = false;
            List<String> copiedWishList = new ArrayList<>(wishList);

            // 1일차부터 모든 세일 품목을 구매할 수 있는지 확인
            for (int j = i; j < discount.length; j++) {
                System.out.println("할인 품목 = " + discount[j]);

                if (!copiedWishList.contains(discount[j])) {
                    if (copiedWishList.size() > 0) {
                        System.out.println("존재하지 않는 할인 품목 = " + discount[j]);
                        System.out.println("");
                        isAllContains = false;
                    }

                    j = discount.length;
                } else {
                    copiedWishList.remove(discount[j]);
                    isAllContains = true;
                }
            }

            if (isAllContains && copiedWishList.size() == 0) {
                System.out.println("모든 할인 품목을 살 수 있는 시작일 = " + (i + 1));
                count++;
            } else {
                System.out.println("모든 상품을 살 수 없음");
            }
        }

        return count;
    }
}
