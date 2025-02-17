import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] point = new int[2];
        int H = park.length;
        int W = park[0].length();

        Map<String, int[]> opMap = new HashMap<>();
        opMap.put("N", new int[]{-1, 0});
        opMap.put("S", new int[]{1, 0});
        opMap.put("W", new int[]{0, -1});
        opMap.put("E", new int[]{0, 1});
        
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (park[i].charAt(j) == 'S') {
                    point[0] = i;
                    point[1] = j;
                    break;
                }
            }
        }
        
        for (String route : routes) {
            String op = route.split(" ")[0];
            int n = Integer.parseInt(route.split(" ")[1]);
            
            int dx = opMap.get(op)[0];
            int dy = opMap.get(op)[1];
            
            int newX = point[0];
            int newY = point[1];
            boolean isValid = true;
            
            for (int i = 0; i < n; i++) {
                newX += dx;
                newY += dy;
                
                if (newX < 0 || newX >= H || newY < 0 || newY >= W || park[newX].charAt(newY) == 'X') {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                point[0] = newX;
                point[1] = newY;
            }
        }
        
        return point;
    }
}
