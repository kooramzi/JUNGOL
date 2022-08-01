import java.util.Scanner;

public class JO616 {
	static int sum1, sum2 = 0;
	static double center1, center2 = 0.0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[6];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (i % 2 == 0) { // 홀수번째 입력된 값
				sum1 += arr[i];
				center1 = sum1 / 3.0;
			} else // 짝수번째 입력된 값
				sum2 += arr[i];
			center2 = sum2 / 3.0;
		}
		sc.close();
		System.out.printf("(%.1f, %.1f)", center1, center2);
	}
}
