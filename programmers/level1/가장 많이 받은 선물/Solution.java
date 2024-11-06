import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        int[][] giveTake = new int[friends.length][friends.length];
        int[] giftCnt = new int[friends.length];
        
        Map<String, Integer> friendIndexMap = new HashMap<>();
        for (int i = 0; i < friends.length; i++) {
            friendIndexMap.put(friends[i], i);
        }

        for (String gift : gifts) {
            String[] parts = gift.split(" ");
            int giveIdx = friendIndexMap.get(parts[0]);
            int takeIdx = friendIndexMap.get(parts[1]);

            giveTake[giveIdx][takeIdx]++;
            giftCnt[giveIdx]++;
            giftCnt[takeIdx]--;
        }
        
        for (int i = 0; i < friends.length; i++) {
            int num = 0;
            for (int j = 0; j < friends.length; j++) {
                if (i == j) continue;
                
                if (giveTake[i][j] > giveTake[j][i] ||
                    (giveTake[i][j] == giveTake[j][i] && giftCnt[i] > giftCnt[j])) {
                    num++;
                }
            }
            
            if (answer < num){
                answer = num;
            }
        }
        return answer;      
    }
}