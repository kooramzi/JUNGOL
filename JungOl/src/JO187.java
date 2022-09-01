import java.util.Scanner;

public class JO187 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int length = str.length();
		int i, j, num = 0;
		char[] ch = new char[100];

		for (i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
		}
		for (i = 0;; i++) {
			if (str.length() == 1) {
				break;
			}
			num = sc.nextInt();
			if (str.length() < num) {
				ch[str.length() - 1] = '\0';
			} else if (str.length() > num) {
				for (j = num - 1; j < str.length() - 1; j++) {
					ch[j] = ch[j + 1];
				}

				ch[j] = '\0';
			}
			length--;
			System.out.println(ch);
			System.out.println();
		}

	}

}
