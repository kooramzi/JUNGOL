import java.util.Scanner;

public class JO633 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		while (true) {
				System.out.printf("1. Korea\r\n" + "2. USA\r\n" + "3. Japan\r\n" + "4. China");
				System.out.println();
				System.out.print("number? ");
				
				num = sc.nextInt();
				System.out.println();
				
				if(num==1)
					System.out.println("Seoul\n");
				else if(num==2)
					System.out.println("Washington\n");
				else if(num==3)
					System.out.println("Tokyo\n");
				else if(num==4)
					System.out.println("Beijing\n");
				else {
					System.out.println("none");
					break;
				}
		}
}
}


