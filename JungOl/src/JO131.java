import java.util.Scanner;

public class JO131 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt(); //���� �Է¹��� �� 
		int b = sc.nextInt(); //���߿� �Է¹��� ��
		int tmp;

		if (a > b) { // a�� b���� Ŭ�� ������ �������ֱ�
			tmp = a;
			a = b;
			b = tmp;
		}

		for(; a<=b; a++) // a���� b���� ���ʷ� ���
		 System.out.print(a + " ");
	}

}
