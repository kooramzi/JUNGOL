import java.util.Scanner;

public class JO135 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0;
		int cnt = 0;
		
		int min=(a<b)?a:b;
		int max=(a<b)?b:a;
		

		for (int i = min; i <= max; i++) {
			
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
				cnt++;
			}


		}
//		float avg= (float)sum/(float)cnt;
//		float avg= (float)sum/(float)cnt;
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f", (float)sum/(float)cnt);
	}

}
