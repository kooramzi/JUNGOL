import java.util.Scanner;

public class JO186 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		sc.close();
		
		if(str1.length()>str2.length()) 
			System.out.println(str1.length());
		else
			System.out.println(str2.length());
	}
	

}
