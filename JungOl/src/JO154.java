import java.util.Scanner;

public class JO154 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] arr = new double[6];
		int i = 0;
		double sum = 0.0f;
		double avg = 0.0f;

		for (i = 0; i < arr.length; i++) {
			arr[i] = sc.nextDouble();
			sum += arr[i];
			avg = sum / arr.length;

		}
		sc.close();
		System.out.printf("%.1f", avg);
	}

}
