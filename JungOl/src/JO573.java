import java.util.Scanner;

public class JO573 {
	public static void print(int n) { // static: 클래스 객체 생성 없이도 메소드 호출 가능
		int x = 1;
		for (int i = 0; i < n; i++) { //각 행
			System.out.println();
			
			for (int j = 0; j < n; j++) { //각 열
				System.out.print(x++ + " ");
				
			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		print(n);

	}

}
