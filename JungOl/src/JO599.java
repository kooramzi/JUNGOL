import java.util.Scanner;

public class JO599 {

	public static void main(String[] args) {

		String input = "";
		String output = "";
		char tmp; // input�� �ѱ��ھ� ������ ����

		Scanner sc = new Scanner(System.in);
		input = sc.nextLine();

		for (int i = 0; i < input.length(); i++) {
			tmp = input.charAt(i);
			if ((97 <= tmp) && (tmp <= 122)) { //���ڰ� 97~122�� ��� (�ҹ����ΰ��)
				output += String.valueOf(tmp).toUpperCase(); //�빮�ڷ� ��ȯ
			} else if((65<=tmp)&&(tmp<=90)){ //���ڰ� 65~90�� ��� (�빮���ΰ��)
				output += (char)tmp;  //�״�� ��´�.
//			} else if((65<=tmp)&&(tmp<=90)){ //���ڰ� 65~90�� ��� (�빮���ΰ��)
//				output += String.valueOf(tmp).toLowerCase(); //�ҹ��ڷ� ��ȯ
			} else 
				continue;
			
		}
		sc.close();
		System.out.println(output);
	}

}
