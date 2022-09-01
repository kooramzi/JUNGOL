import java.util.Scanner;

public class JO601_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String inp = sc.next();
		sc.close();
		
		
		for(int i = 1; i <= inp.length(); i++) {
			System.out.print(inp.substring(inp.length()-i, inp.length()));
			System.out.println(inp.substring(0, inp.length()-i));
		}
		
	}

}
