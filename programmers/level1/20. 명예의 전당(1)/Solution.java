import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] answer = new int[score.length];
        
        for (int i = 0; i < score.length; i++) {
            list.add(score[i]);
            
            if (list.size() > k) {
                list.remove(Collections.min(list));
            }
            
            answer[i] = Collections.min(list);
        }
        return answer;
    }
}