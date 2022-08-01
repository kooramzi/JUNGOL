import java.util.Scanner;

public class JO596_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int inp = sc.nextInt();
		sc.close();

		System.out.println(str + " " + inp);

		if (str.length() >= inp) {

			for (int i = str.length() - 1, cnt = 0; cnt < inp; i--, cnt++) {
				System.out.print(str.charAt(i));
			}
		} else {
			for (int i = str.length() - 1; i >= 0; i--) {
				System.out.print(str.charAt(i));
			}
		}

	}

}
