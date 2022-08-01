import java.util.Scanner;

public class JO533 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String gen = sc.next();
		int age = sc.nextInt();
		
		if (gen.equals("M")) {
			if (age > 18)
				System.out.println("MAN");
			else
				System.out.println("BOY");
		}
		else if (gen.equals("F")) {
				if (age > 18)
					System.out.println("WOMAN");
				else
					System.out.println("GIRL");
			}
		}

	}

