import java.util.Scanner;

public class JO1856 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // ��
		int m = sc.nextInt(); // ��
		int num = 1;
		int[][] Arr = new int[n][m];

		sc.close();

		for (int i = 0; i < n; i++) { //�簢�� n�� ��ŭ �ݺ�
			if (i % 2 == 0) { // ¦����
				for (int j = 0; j < m; j++) { //m����ŭ �ݺ�
					Arr[i][j] = num++;
				}
			} else { // Ȧ����
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
