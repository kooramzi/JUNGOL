import java.util.Scanner;

public class JO599 {

	public static void main(String[] args) {

		String input = "";
		String output = "";
		char tmp; // input을 한글자씩 저장할 변수

		Scanner sc = new Scanner(System.in);
		input = sc.nextLine();

		for (int i = 0; i < input.length(); i++) {
			tmp = input.charAt(i);
			if ((97 <= tmp) && (tmp <= 122)) { //문자가 97~122인 경우 (소문자인경우)
				output += String.valueOf(tmp).toUpperCase(); //대문자로 변환
			} else if((65<=tmp)&&(tmp<=90)){ //문자가 65~90인 경우 (대문자인경우)
				output += (char)tmp;  //그대로 담는다.
//			} else if((65<=tmp)&&(tmp<=90)){ //문자가 65~90인 경우 (대문자인경우)
//				output += String.valueOf(tmp).toLowerCase(); //소문자로 변환
			} else 
				continue;
			
		}
		sc.close();
		System.out.println(output);
	}

}
