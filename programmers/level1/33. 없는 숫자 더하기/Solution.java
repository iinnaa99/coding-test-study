import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        
        List<Integer> list =  new ArrayList<>();
        for (int num : numbers) {
            list.add(num);
        }
        
        int answer = 0;
        for (int i = 0; i < 10; i++) {
            if (!list.contains(i)) 
                answer += i;
        }
        return answer;
    }
}