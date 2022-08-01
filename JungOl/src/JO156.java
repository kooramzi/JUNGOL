import java.util.Scanner;

public class JO156 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[100];
		int min = 10000;
		int max = -1000;

		for (int i = 0; i < 100; i++) { //�꽭�옄由� �씠�븯
			arr[i] = sc.nextInt();

			if (arr[i] == 999)
				break;
			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("max : " + max);
		System.out.println("min : " + min);

	}

}
