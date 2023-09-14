package dev.kkkkkksssssaaaa.practice.algorithm.lv1;

// 기사단원의 무기
class NightsWeapon {

    public int solution(int nightNumber, int powerLimit, int staticWeaponPower) {
        int totalSteelsWeight = 0;

        for (int thisNightNumber = 1; thisNightNumber <= nightNumber; thisNightNumber++) {
            // 무기의 공격력
            int weaponPower = 0;

            for (int i = 1; i <= thisNightNumber; i++) {
                if (thisNightNumber % i == 0) {
                    weaponPower++;
                }
            }

            // 협약을 맺은 공격력 제한 수치 보다 구매하려는 무기의 공격력이 더 높을 때
            if (weaponPower > powerLimit) {
                totalSteelsWeight += staticWeaponPower;
            } else {
                totalSteelsWeight += weaponPower;
            }
        }

        return totalSteelsWeight;
    }
}
