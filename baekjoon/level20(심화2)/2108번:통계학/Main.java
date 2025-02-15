import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];
		double sum = 0;

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		sc.close();

		Arrays.sort(arr);

		System.out.println(Math.round(sum / arr.length));
		System.out.println(arr[arr.length / 2]);
		System.out.println(frequence(arr));
		System.out.println(arr[arr.length - 1] - arr[0]);

	}

	private static int frequence(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int num : arr) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		int cnt = 0;
		for (int val : map.values()) {
			cnt = Math.max(cnt, val);
		}

		List<Integer> list = new ArrayList<>();
		for (int key : map.keySet()) {
			if (map.get(key) == cnt) {
				list.add(key);
			}
		}

		Collections.sort(list);

		if (list.size() >= 2) {
			return list.get(1);
		} else {
			return list.get(0);
		}
	}
}