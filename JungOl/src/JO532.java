import java.util.Scanner;

public class JO532 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Float f1 = sc.nextFloat();
		Float f2 = sc.nextFloat();
		if (f1 >= 4.0f && f2 >= 4.0f)
			System.out.println("A");
		else if (f1 >= 3.0f && f2 >= 3.0f)
			System.out.println("B");
		else
			System.out.println("C");

	}

}
