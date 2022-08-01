import java.util.Scanner;

public class JO152 {

//	10개의 정수를 입력받아 홀수 번째 입력받은 정수의 합과
//	짝수 번째 입력받은 정수의 합을 출력하는 프로그램을 작성하시오.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int i = 0;
		int sum1 = 0;
		int sum2 = 0;
		for (i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (i % 2 == 0) { // 홀수번째 입력받은 값
				sum1 += arr[i];
			} else { // 짝수번째 입력받은 값
				sum2 += arr[i];
			}

		}

		sc.close();
		System.out.println("odd : " + sum1);
		System.out.println("even : " + sum2);
	}

}
