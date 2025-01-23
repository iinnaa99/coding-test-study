import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		double totalSum = 0;
		double scoreSum = 0;

		for (int i = 0; i < 20; i++) {
			st = new StringTokenizer(br.readLine());
			String subject = st.nextToken();
			double score = Double.parseDouble(st.nextToken());
			String grade = st.nextToken();
			double point = 0;

			if (!(grade.equals("P"))) {
				switch (grade) {
				case "A+":
					point = 4.5;
					break;
				case "A0":
					point = 4.0;
					break;
				case "B+":
					point = 3.5;
					break;
				case "B0":
					point = 3.0;
					break;
				case "C+":
					point = 2.5;
					break;
				case "C0":
					point = 2.0;
					break;
				case "D+":
					point = 1.5;
					break;
				case "D0":
					point = 1.0;
					break;
				case "F":
					point = 0.0;
					break;
				default:
					break;
				}

				totalSum += (score * point);
				scoreSum += score;
			}
		}

		System.out.printf("%.6f", totalSum / scoreSum);
		br.close();
	}
}