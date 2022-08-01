import java.util.Scanner;

public class JO524 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		
//		a = a != 0 ? 1 : 0;
//		b = b != 0 ? 1 : 0;
		sc.close();
		
		boolean b1 = (a!=0) && (b!=0);
		boolean b2 = (a!=0) || (b!=0);
		
		int i1 = b1 ? 1: 0;
		int i2 = b2 ? 1: 0;

		System.out.printf("%d %d\n\n", i1, i2);
		System.out.println("[JAVA]\nfalse true");
	}

}
