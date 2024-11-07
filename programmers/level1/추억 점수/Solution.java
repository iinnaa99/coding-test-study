import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> people = new HashMap<>();
        for(int i = 0; i < name.length; i++) {
            people.put(name[i], yearning[i]);
        }
        
        int[] result = new int[photo.length];
        
        int i = 0;
        for (String[] names : photo) {
            int total = 0;
            for (String person : names) {
                total += people.getOrDefault(person, 0);
            }
            result[i++] = total;
        }
        
        return result;
    }
}