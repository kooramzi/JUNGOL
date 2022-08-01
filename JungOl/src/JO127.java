import java.util.Scanner;

public class JO127 {

	public static void main(String[] args) {

		int num = 0, sum = 0;
		int cnt = 0;

		Scanner sc = new Scanner(System.in);

		while (true) {
			num = sc.nextInt();
			
			if (num < 0 || num > 100)
				//범위를 벗어나는 경우는 num이 100이상일때만이 아니라, 음수일때도 있다.
				break; //break 되는 경우를 먼저 써줘야제대로 나옴. 왜?
			
			sum += num;
			cnt++;
			
		}
		sc.close();
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f\n", (double) sum / cnt);

	}

}