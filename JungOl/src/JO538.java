import java.util.Scanner;

public class JO538 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.print("number? ");
			int x = s.nextInt();

			if (x > 0)
				System.out.println("positive integer");
			else if (x < 0)
				System.out.println("negative number");
			else if (x == 0)
				break;
		}
	}

}
