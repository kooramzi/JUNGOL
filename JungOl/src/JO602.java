import java.util.Scanner;

public class JO602 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String [] ani = new String[5];
		
		for(int i =0; i<ani.length; i++) {
			ani[i] =  sc.next();
		}
		sc.close();
		
		for(int i = ani.length; i>=0; i--) {
			System.out.println(ani[i]);
		}
		
	}
}
