import java.util.Scanner;

public class JO127 {

	public static void main(String[] args) {

		int num = 0, sum = 0;
		int cnt = 0;

		Scanner sc = new Scanner(System.in);

		while (true) {
			num = sc.nextInt();
			
			if (num < 0 || num > 100)
				//������ ����� ���� num�� 100�̻��϶����� �ƴ϶�, �����϶��� �ִ�.
				break; //break �Ǵ� ��츦 ���� ���������� ����. ��?
			
			sum += num;
			cnt++;
			
		}
		sc.close();
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f\n", (double) sum / cnt);

	}

}