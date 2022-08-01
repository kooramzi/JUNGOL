import java.util.Scanner;

public class JO596 {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		
		int index = 0;
		Scanner sc = new Scanner(System.in);

		sb.append(sc.next());
		index = sc.nextInt();
		
		
		
		
		if(index > sb.length()) {
			sb.reverse();
			System.out.println(sb);
		} else {
			sb.reverse();
			sb.delete(index, sb.length());
			System.out.println(sb);
		}
			
	}

}
