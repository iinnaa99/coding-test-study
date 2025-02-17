import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	static char[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb;

		String str;
		while ((str = br.readLine()) != null) {
			int N = Integer.parseInt(str);
			sb = new StringBuilder();

			int len = (int) Math.pow(3, N);

			arr = new char[len];
			Arrays.fill(arr, '-');

			divide(0, len);

			for (int i = 0; i < arr.length; i++) {
				sb.append(arr[i]);

			}
			System.out.println(sb.toString());
		}
		br.close();
	}

	public static void divide(int start, int length) {
		if (length <= 1)
			return;

		int newLen = length / 3;

		for (int i = start + newLen; i < start + newLen * 2; i++) {
			arr[i] = ' ';
		}

		divide(start, newLen);
		divide(start + newLen * 2, newLen);
	}
}