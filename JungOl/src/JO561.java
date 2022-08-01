import java.util.Scanner;

public class JO561 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int min = 0;
		int max = 10000;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] >= 0 && arr[i] < 100) {
				if (min < arr[i]) {
					min = arr[i];
				}
			}
			if (arr[i] > 100 && arr[i] < 1000) {
				if (arr[i] < max) {
					max = arr[i];
				}
			}
		}
		if (min == 0)
			min = 100;
		if (max == 10000)
			max = 100;
		
		System.out.printf("%d %d", min, max);

	}
}
