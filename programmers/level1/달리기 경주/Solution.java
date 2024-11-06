import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> rankMap = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            rankMap.put(players[i], i);
        }
        
        for (String call : callings) {
            int callRank = rankMap.get(call);
            
            String frontPlayer = players[callRank - 1];
            
            players[callRank - 1] = call;
            players[callRank] = frontPlayer;
            
            rankMap.put(call, callRank - 1);
            rankMap.put(frontPlayer, callRank);
        }
        return players;
    }
    
}