import java.util.Scanner;

public class JO601 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char [] c = new char[101];
		char temp;
		
		
		for (int i = 0; i < c.length; i++) {
			temp = c[c.length - 1]; // �� ���ڸ� �ӽú����� ����

			for (int j = c.length - 1; j > 0; j--) { //�����ں��� ó�� ���ڱ���
				c[j] = c[j - 1]; //��ĭ�� �о��.
			}
			c[0] = temp;

			for (int k = 0; k < c.length; k++) {
				System.out.printf("%c", c[k]);
			}
		}
		System.out.println();
	}
}
