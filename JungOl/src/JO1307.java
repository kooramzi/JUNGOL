import java.util.Scanner;

public class JO1307 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
//		char ch='A';
		int num = 65;
		char[][] arr = new char[n][n];

		// �ٱ�����(��), ��������(��)->�� �ֱ�
		for (int i = n - 1; i >= 0; i--) {
			for (int j = n - 1; j >= 0; j--) {
				if (num > 90) { // Z ������ A�� ������
					num = 65;
				}
				arr[j][i] = (char) num;
				num++;
			}
		}
		/*
		 * 3,3
		 * 3,2
		 * 3,1
		 * 3,0
		 * 
		 * 2,3
		 * 2,2
		 * 2,1
		 * 2,0		 		 
		 */
		
		
		//����ϱ�
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
