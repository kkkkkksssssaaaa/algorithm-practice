package dev.kkkkkksssssaaaa.practice.algorithm.lv2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 의상
class Clothes {

    @Test
    void doTest() {
        assertEquals(
            5,
            solution(
            new String[][]{
                {"yellow_hat", "headgear"},
                {"blue_sunglasses", "eyewear"},
                {"green_turban", "headgear"}
            }
        ));

        assertEquals(
            3,
            solution(
                new String[][]{
                    {"crow_mask", "face"},
                    {"blue_sunglasses", "face"},
                    {"smoky_makeup", "face"}
                }
            ));
    }

    public int solution(String[][] clothes) {
        Map<String, List<String>> clothesMap = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            if (clothesMap.containsKey(clothes[i][1])) {
                clothesMap.get(clothes[i][1]).add(clothes[i][0]);
            } else {
                List<String> clothesList = new ArrayList<>();
                clothesList.add(clothes[i][0]);

                clothesMap.put(clothes[i][1], clothesList);
            }
        }

        int result = 1;

        List<Map.Entry<String, List<String>>> entryList =
            clothesMap.entrySet()
                .stream()
                .collect(Collectors.toList());

        for (Map.Entry<String, List<String>> stringListEntry : entryList) {
            result = result * (1 + stringListEntry.getValue().size());
        }

        return result - 1;
    }
}
