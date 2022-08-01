import java.util.Scanner;

public class JO158 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[100];
		int i = 0;
		int cnt = 0;

		for (i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

			if (arr[i] == 0)
				break; // 0을 제외하고출력하기 위해 먼저 빠져나간뒤 개수를 카운한다.
			cnt++;
		}
		System.out.println(cnt);

		for (i = 0; i < cnt; i++) {
			if (arr[i] % 2 != 0) // 입력받은수가 홀수일떄,
				arr[i] = arr[i] * 2;
			else 				// 짝수일때,
				arr[i] = arr[i] / 2;

			System.out.print(arr[i] + " ");
		}
	}
}
