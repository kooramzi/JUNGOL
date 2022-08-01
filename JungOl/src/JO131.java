import java.util.Scanner;

public class JO131 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt(); //먼저 입력받은 수 
		int b = sc.nextInt(); //나중에 입력받은 수
		int tmp;

		if (a > b) { // a가 b보다 클때 앞으로 정렬해주기
			tmp = a;
			a = b;
			b = tmp;
		}

		for(; a<=b; a++) // a부터 b까지 차례로 출력
		 System.out.print(a + " ");
	}

}
