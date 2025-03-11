import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] stageStatus = new int[N + 1];
        for (int num : stages) {
            if (num == N + 1)
                continue;
            stageStatus[num]++;
        }
        
        Map<Integer, Double> res = new HashMap<>();
        int total = stages.length;
        
        for (int i = 1; i < N + 1; i++) {
            if (total == 0) {
                res.put(i, (double) 0);
            } else {
                double rate = (double) stageStatus[i] / (double) total;
                total -= stageStatus[i];
                res.put(i, rate);
            }
        }
        
        List<Integer> list = new ArrayList<>(res.keySet());
		Collections.sort(list, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return Double.compare(res.get(o2), res.get(o1));
			}
		});
		
		int[] answer = new int[N];
		for (int i = 0; i < N; i++) {
			answer[i] = list.get(i);
		}
		return answer;
    }
}