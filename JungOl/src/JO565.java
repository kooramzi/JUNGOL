import java.util.Scanner;

public class JO565 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];
		int num;

		while (true) {

			num = sc.nextInt();
			if (num == 0) {
				break;
			} else {
				arr[num / 10]++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				System.out.println(i + " : "+arr[i]);
			}
		}
	}

}
