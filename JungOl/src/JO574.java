import java.util.Scanner;

public class JO574 {

public static int max(int num1, int num2, int num3) {
	int max= num1;
	
	if(max < num2) 
		max=num2;
	if(max<num3)
		max=num3;
	
	return max;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		System.out.println(max(num1, num2, num3));

		sc.close();

	}

}
