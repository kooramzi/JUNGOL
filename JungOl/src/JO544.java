import java.util.Scanner;

public class JO544 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int sum = 0;

		
			if (n <= 100)
				for(int i=n; i<=100; i++) 
					sum+=i;
				
			System.out.println(sum);
		
	}

}
