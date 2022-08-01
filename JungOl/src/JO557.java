import java.util.Scanner;

public class JO557 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char[] arr = new char[10];

		for (int i = 0; i < arr.length; i++)
			arr[i] = s.next().charAt(0);

		System.out.printf("%c %c %c", arr[0], arr[3], arr[6]);

	}

}
