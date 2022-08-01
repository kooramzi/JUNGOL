import java.util.Scanner;

public class JO2046 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int num = 1;
		sc.close();

		if (n <= 100 && m <= 3) {
			switch (m) {
			case 1:
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						System.out.print(num + " ");
					}
					System.out.println();
					num++;
				}
				break;

			case 2:
				for (int i = 1; i <= n; i++) {
					if (i % 2 == 0) { // 짝수줄 역방향 출력
						for (int j = n; j > 0; j--) {
							System.out.print(j + " ");
						}
					} else { // 홀수줄 정방향 출력
						for (int j = 1; j <= n; j++) {
							System.out.print(j + " ");
						}
					}
					System.out.println();
				}

				break;

			case 3:
				for (int i = 1; i <= n; i++) {
					for (int j = 1; j <= n; j++) {
						System.out.print(i * j + " ");
					}
					System.out.println();

				}
				break;

			}

		}
	}
}
