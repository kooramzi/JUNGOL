import java.util.Scanner;

public class JO151 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int i = 0;
		int sum = 0;
		for (i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (i % 2 == 0) { // 홀수번째(1,3,5) 입력받은 값
				sum += arr[i];
			}
		}
		System.out.println(sum);
	}
}
