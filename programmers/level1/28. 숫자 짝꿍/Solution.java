import java.util.*;

class Solution {
    public String solution(String X, String Y) {
		Map<String, Integer> mapX = new HashMap<>();
		Map<String, Integer> mapY = new HashMap<>();
		List<String> list = new ArrayList<>();

		for (String key : X.split("")) {
			mapX.put(key, mapX.getOrDefault(key, 0) + 1);
		}

		for (String key : Y.split("")) {
			mapY.put(key, mapY.getOrDefault(key, 0) + 1);
		}

		for (String key : mapX.keySet()) {
			if (!mapY.containsKey(key))
				continue;

			int len = Math.min(mapX.get(key), mapY.get(key));
			for (int i = 0; i < len; i++) {
				list.add(key);
			}
		}

		Collections.sort(list, Collections.reverseOrder());
        
        String answer = String.join("", list);

		if (list.size() == 0)
			return "-1";
        
        if (answer.replaceAll("0", "").isEmpty()) 
            return "0";

		return answer;
    }
}