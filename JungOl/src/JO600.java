import java.util.Scanner;

public class JO600 {

	public static void main(String[] args) {
		String input;
		Scanner sc = new Scanner(System.in);
		input = sc.nextLine();
		int cnt = 1;

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i)== ' ') //�����϶����� ���� ���� ī��Ʈ �ø�
				cnt++;
		}
		sc.close();
		System.out.println(cnt);
	}

}
