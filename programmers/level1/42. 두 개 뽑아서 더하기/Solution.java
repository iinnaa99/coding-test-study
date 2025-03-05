import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
    
        Set<Integer> set = new TreeSet<Integer>();
        
        for (int i = 0; i < numbers.length - 1; i++){
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        
        int[] answer = new int[set.size()];
        int index = 0;
        for (int n : set) {
            answer[index++] = n;
        }

        return answer;
    }
}