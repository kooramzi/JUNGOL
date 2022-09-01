import java.util.Scanner;

public class JO607 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String [] arr1 = str1.split("");
		String str2 = sc.next();
		String [] arr2 = str2.split("");
		
		String result = arr1[0]+arr1[1];
		
		for(int i=2; i<arr2.length; i++) {
			result+=arr2[i];
		}
		
		result+=arr1[0]+arr1[1];
		System.out.println(result);
	}

}
