import java.util.Scanner;

public class JO1303 {
	private static int[][] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int num = 1;

		sc.close();

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {// Â¦¼öÇàÀÏ¶§
				for (int j = 0; j < m; j++) {
					arr[i][j] = num++;
					System.out.printf("%d ",num);
				}
				System.out.println();
			} else {
				for(int j=m-1; j>=0; j--) {
					arr[i][j]=num++;
				}
			}
		}
	}
}
