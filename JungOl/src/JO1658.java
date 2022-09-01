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
		
		int gcd = getGCD(a,b);  //최대공약수
		int lcm = a*b/gcd;		//최소공배수 : 두수의 최대공약수를 알 경우 두 수의 곱을 최대공약수로 나눈 몫이 됨
		
		System.out.println(gcd+"\n"+lcm);
	}

}
