import java.util.Scanner;

public class JO1658 {

	public static int getGCD(int a, int b) {
		if(b==0) 
			return a;
		else
			return getGCD(b, a%b);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int gcd = getGCD(a,b);  //�ִ�����
		int lcm = a*b/gcd;		//�ּҰ���� : �μ��� �ִ������� �� ��� �� ���� ���� �ִ������� ���� ���� ��
		
		System.out.println(gcd+"\n"+lcm);
	}

}
