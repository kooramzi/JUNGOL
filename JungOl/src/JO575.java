import java.util.Scanner;

public class JO575 {
	public void mypow(int a, int b) {
		
		int res = 1;
		for(int i =0; i<b; i++) {
			res*=a;
		}
		System.out.println(res);
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a= sc.nextInt();
		int b= sc.nextInt();
		sc.close();		
		
		JO575 jo = new JO575();
		jo.mypow(a, b);
	}
}
