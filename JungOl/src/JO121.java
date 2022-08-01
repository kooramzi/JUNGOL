import java.util.Scanner;

public class JO121 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		if (a == 0)
			System.out.println("zero");
		else if (a > 0)
			System.out.println("plus");
		else
			System.out.println("minus");
	}

}
