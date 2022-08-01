import java.util.Scanner;

public class JO155 {

	public static void main(String[] args) {

		char[] c = new char[] { 'J', 'U', 'N', 'G', 'O', 'L' };

		Scanner sc = new Scanner(System.in);

		char a = sc.next().charAt(0);

		boolean b = false;

		for (int i = 0; i < c.length; i++) {
			if (c[i] == a) {
				System.out.println(i);
				b = true;

			}
		}

		if (b == false)
			System.out.println("none");
	}
}
