import java.util.Scanner;

public class JO546 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int n = sc.nextInt();
		double avg;

		for (int i = 0; i < n; i++) {
			sum += sc.nextInt();;
		}
		avg = (double) sum / n;
		System.out.printf("avg : %.1f\n", avg);
		
		if (avg >= 80.0) {
			System.out.println("pass");
		} else
			System.out.println("fail");

	}

}
