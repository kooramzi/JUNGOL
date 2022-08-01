import java.util.Scanner;

public class JO615_1 {

	public static void main(String[] args) {
		
		int[][]arr = new int[2][2];
		Scanner sc = new Scanner(System.in);
		int[] sum = new int[2];
		
		double avg;
		
		for(int i = 0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
				sum[i]+=arr[i][j];
				
			}
		}
		
		for(int i = 0; i<sum.length; i++) {
			avg = sum[i]/2;
		}
		System.out.println("avg: "+);
	}

}
