import java.util.Scanner;

public class JO573 {
	public static void print(int n) { // static: Ŭ���� ��ü ���� ���̵� �޼ҵ� ȣ�� ����
		int x = 1;
		for (int i = 0; i < n; i++) { //�� ��
			System.out.println();
			
			for (int j = 0; j < n; j++) { //�� ��
				System.out.print(x++ + " ");
				
			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		print(n);

	}

}
