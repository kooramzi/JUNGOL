import java.util.Scanner;

public class JO530 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int age = sc.nextInt();
		int adult =20;
				
				
		if (age >= adult) {
			System.out.println("adult");
		} else  {
			System.out.println((adult-age)+" years later");
		}
		
	}

}
