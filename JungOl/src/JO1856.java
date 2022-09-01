import java.util.Scanner;

public class JO1856 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 행
		int m = sc.nextInt(); // 열
		int num = 1;
		int[][] Arr = new int[n][m];

		sc.close();

		for (int i = 0; i < n; i++) { //사각형 n행 만큼 반복
			if (i % 2 == 0) { // 짝수줄
				for (int j = 0; j < m; j++) { //m열만큼 반복
					Arr[i][j] = num++;
				}
			} else { // 홀수줄
				for (int j = m-1 ;j >=0; j--) { 
					Arr[i][j] = num++;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(Arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
