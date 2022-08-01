import java.util.Scanner;

public class JO540 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		while (true) {
			int x = s.nextInt();

			if (x % 3 == 0)
				System.out.printf("%d\n", x / 3);

			else if (x == -1) {
				break;
			}
		}
		s.close();
	}
}
