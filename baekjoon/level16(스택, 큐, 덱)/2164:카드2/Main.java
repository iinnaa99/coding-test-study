import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		Queue<Integer> queue = new LinkedList<>();

		int n = sc.nextInt();
		sc.close();

		for (int i = 1; i <= n; i++) {
			queue.offer(i);
		}

		while (queue.size() > 1) {
			queue.poll();
			queue.offer(queue.poll());
		}

		System.out.println(queue.poll());
	}
}