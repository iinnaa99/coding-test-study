import java.util.*;

class Solution {
    	public static int solution(int[][] points, int[][] routes) {
        Map<Integer, int[]> pointMap = new HashMap<>();
        for (int i = 0; i < points.length; i++) {
            pointMap.put(i + 1, points[i]);
        }
        
        Map<String, Integer> positionCnt = new HashMap<>();
        int result = 0;

        for (int[] route : routes) {
            int time = 0; 
            
            int[] start = pointMap.get(route[0]);
            result = positionCheck(start[0], start[1], time, positionCnt, result);
            
            for (int i = 0; i < route.length - 1; i++) {
                start = pointMap.get(route[i]);
                int[] end = pointMap.get(route[i + 1]);

                int r1 = start[0], c1 = start[1];
                int r2 = end[0], c2 = end[1];
                
                while (r1 != r2) {
                    r1 += (r1 < r2) ? 1 : -1;
                    time++;
                    result = positionCheck(r1, c1, time, positionCnt, result);
                }
                
                while (c1 != c2) {
                    c1 += (c1 < c2) ? 1 : -1;
                    time++;
                    result = positionCheck(r1, c1, time, positionCnt, result);
                }
            }
        }
        
        return result;
    }
	
	private static int positionCheck(int r1, int c1, int time, Map<String, Integer> positionCnt, int result) {
        String position = r1 + "_" + c1 + "_" + time;
        if (positionCnt.getOrDefault(position, 0) == 1) {
            result++;
        }
        positionCnt.put(position, positionCnt.getOrDefault(position, 0) + 1);
        
        return result;
	}
}