import java.util.Scanner;

public class JO543 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			if (i % 2 == 0) //처음에 n으로써서 계속 실패함 ㅜㅜ
				System.out.print(i + " ");

			else
				continue;
		}
	}

}