import java.util.Scanner;

public class JO150 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = new char[10];
		int i = 0;

		for (i = 0; i < arr.length; i++) {
			arr[i] = sc.next().charAt(0); // 일단 값을 입력받고,
		}
		sc.close();
		for (i = arr.length-1; i >= 0; i--) { //거꾸로 출력
			System.out.print(arr[i] + " ");
		}
	}

}
