import java.util.Scanner;

public class JO164 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] jeki = new int[4][3]; //�� 4�� �ѹݴ� 3��
		
		//�Էº�
		for(int i =0; i<4; i++) {
			System.out.print((i+1)+"class? ");
			for(int j=0; j<3; j++) {
				jeki[i][j] = sc.nextInt();
				
			}
		}
		sc.close();
		
		//��º�
		for(int i =0; i<4; i++) {
			int sum=0; //�ѹ��� �������� 0���� �ʱ�ȭ
			for(int j=0; j<3; j++) {
				sum+=jeki[i][j];
			}
			System.out.println((i+1)+"class : "+ sum);
		}
		
	}
}

