//import java.util.Scanner;
//
//public class JO598 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		
//		while (true) {
//			char a = sc.next().charAt(0);
//
//			if ((a >= 65 && a <= 90) || (a<=97 && a<=122)) {
//				System.out.println(a);
//			} else if (a >= 48 && a <= 57) {
//				int num = Integer.valueOf(a);
//				System.out.println(num);
//			} else
//				break;
//		}
//		sc.close();
//	}
//
//}


import java.util.Scanner;

public class JO598 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		while (true) {
			char a = sc.next().charAt(0);

			if (Character.isAlphabetic(a)) {
				System.out.printf("%c\n",a);
			} else if (Character.isDigit(a)) {
				int num = Integer.valueOf(a);
				System.out.printf("%d\n",num);
			} else
				break;
		}
		sc.close();
	}

}