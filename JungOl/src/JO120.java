import java.util.Scanner;

public class JO120 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int min = (a < b) ? a : b;
		int max = (a > b) ? a : b;
		System.out.println(max - min);
	}

}
