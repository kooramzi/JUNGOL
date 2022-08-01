import java.util.Scanner;

public class JO539 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0, num = 0, sum = 0;
		int count = 0;


		while (num<100) {
			num += sc.nextInt();
			sum += num;
			count++;
			
//			if (num < 100) {
//				sum += num;
//			}
//			else if (num >= 100)
//				sum += num;
//				break;
		}
		sc.close();
		System.out.println(sum);
		System.out.printf("%.1f\n",(double)sum/count);

	}
}
