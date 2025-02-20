import java.util.*;

class Solution {
	public int[] solution(String[] id_list, String[] report, int k) {
		int[] answer = new int[id_list.length];
		Map<String, Integer> userMap = new HashMap<>();
		Map<String, HashSet<String>> reportMap = new HashMap<>();

		for (int i = 0; i < id_list.length; i++) {
			userMap.put(id_list[i], i);
			reportMap.put(id_list[i], new HashSet<>());
		}

		for (String str : report) {
			String user = str.split(" ")[0];
			String target = str.split(" ")[1];

			reportMap.get(target).add(user);
		}

		for (int i = 0; i < id_list.length; i++) {
			HashSet<String> set = reportMap.get(id_list[i]);
			if (set.size() >= k) {
				for (String user : set) {
					answer[userMap.get(user)]++;
				}
			}
		}
		return answer;
	}
}