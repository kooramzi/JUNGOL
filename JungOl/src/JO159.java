import java.util.Scanner;

public class JO159 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] score = new int[20];
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			score[i] = sc.nextInt();
		}
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num - 1; j++) {
				if (score[j] < score[j + 1]) { 
					int temp = score[j]; 
					score[j] = score[j + 1]; 
					score[j + 1] = temp; 
				}
			}
		}
		for (int i = 0; i < num; i++) {
			System.out.println(score[i]);
		}
	}

}
