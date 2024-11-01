class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        // 현재 체력
        int nowHealth = health;
        // 붕대감기 연속 성공
        int relSuc = 0;
        
        for (int i = 0; i <= attacks[attacks.length - 1][0]; i++) {
            // 몬스터 공격 피해량
            int damage = 0;
            // 몬스터 공격 시간 체크
            for(int j = 0; j < attacks.length; j++) {
                if (i == attacks[j][0]){
                    // 몬스터 공격 피해량 취득
                    damage = attacks[j][1];
                    break;
                }
            }
            
            // 몬스터 공격 있을 때
            if (damage > 0) {
                nowHealth -= damage;
                relSuc = 0;
            } else {
                // 붕대감기
                if (nowHealth < health) {
                    nowHealth += bandage[1];
                    relSuc++;
                    
                    // 연속 감기 성공
                    if (relSuc == bandage[0]) {
                        nowHealth += bandage[2];
                        relSuc = 0;
                    }    
                    
                    // 최대 체력 이상
                    if(nowHealth > health) {
                        nowHealth = health;
                    }
                }
            }
            
            // 체력이 0 이하
            if (nowHealth <= 0){
                return -1;
            }
        }
        
        return nowHealth;
    }
}