import java.util.Scanner;

public class JO162 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[10];
		for(int i =0; i<2; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		for(int i=0; i<arr.length-2; i++) { //outofindex¹æÁö
			arr[i+2] = (arr[i]+arr[i+1])%10;
		}

		for(int i =0; i<arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
	}
}