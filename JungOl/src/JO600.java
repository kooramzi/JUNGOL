import java.util.Scanner;

public class JO600 {

	public static void main(String[] args) {
		String input;
		Scanner sc = new Scanner(System.in);
		input = sc.nextLine();
		int cnt = 1;

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i)== ' ') //공백일때마다 낱말 개수 카운트 올림
				cnt++;
		}
		sc.close();
		System.out.println(cnt);
	}

}
