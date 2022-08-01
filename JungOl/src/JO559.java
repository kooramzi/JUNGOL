import java.util.Scanner;

public class JO559 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] arr = { 85.6, 79.5, 83.1, 80.0, 78.2, 75.0 };
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		double sum = (arr[a - 1] + arr[b - 1]);

		System.out.printf("%.1f", sum);
	}
}
