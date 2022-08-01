import java.util.Scanner;

public class JO153 {

	public static void main(String[] args) {
		int[] arr = new int[100];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] == -1) {
				if (i <= 2) {
					for (i = 0; i < arr[i]; i++)
						System.out.print(arr[i] + " ");
					break;
				}
				System.out.printf("%d %d %d", arr[i - 3], arr[i - 2], arr[i - 1]);
				break;
			}
		}
		sc.close();
	}

}
