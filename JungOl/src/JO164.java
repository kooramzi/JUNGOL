import java.util.Scanner;

public class JO164 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] jeki = new int[4][3]; //반 4개 한반당 3명
		
		//입력부
		for(int i =0; i<4; i++) {
			System.out.print((i+1)+"class? ");
			for(int j=0; j<3; j++) {
				jeki[i][j] = sc.nextInt();
				
			}
		}
		sc.close();
		
		//출력부
		for(int i =0; i<4; i++) {
			int sum=0; //한바퀴 돌때마다 0으로 초기화
			for(int j=0; j<3; j++) {
				sum+=jeki[i][j];
			}
			System.out.println((i+1)+"class : "+ sum);
		}
		
	}
}

