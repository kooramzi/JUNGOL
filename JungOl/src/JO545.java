import java.util.Scanner;

public class JO545 {

	public static void main(String[] args) {
		int cnt3 = 0;
		int cnt5 = 0;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			int x = sc.nextInt();

			if (x % 3 == 0) {
				cnt3++;
			}
			if (x % 5 == 0) {
				cnt5++;
			}

		} 
		sc.close();
		System.out.println("Multiples of 3 : " + cnt3);
		System.out.println("Multiples of 5 : " + cnt5);
	}

	}

