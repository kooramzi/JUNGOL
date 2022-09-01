import java.util.Scanner;

public class JO601 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char [] c = new char[101];
		char temp;
		
		
		for (int i = 0; i < c.length; i++) {
			temp = c[c.length - 1]; // 끝 문자를 임시변수에 저장

			for (int j = c.length - 1; j > 0; j--) { //끝문자부터 처음 문자까지
				c[j] = c[j - 1]; //한칸씩 밀어낸다.
			}
			c[0] = temp;

			for (int k = 0; k < c.length; k++) {
				System.out.printf("%c", c[k]);
			}
		}
		System.out.println();
	}
}
