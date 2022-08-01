import java.util.Scanner;

public class JO563 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();   //일단 값을 입력받고,
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1 ; j++) {
				if (arr[j] < arr[j+1]) { //배열의 첫번째와 두번째를 비교해서 두번째가 크다
					int temp = arr[j]; //첫번쨰를 임시변수에 넣고,
					arr[j] = arr[j+1]; //두번쨰를 첫번째에,
					arr[j+1] = temp; //두번째에 임시변수에 들어있던 첫번째를 넣는다.
					//내림차순 버블정렬
				}
			}
		} sc.close();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
