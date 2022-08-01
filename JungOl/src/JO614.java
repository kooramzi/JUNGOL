import java.util.Scanner;

class School {
	String school1 = "Jejuelementary";
	int grade1 = 6;
//	String school2;
//	int grade2;
}

public class JO614 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		School s = new School();
		School s1 = new School();

		s1.school1 =sc.next();
		s1.grade1  =sc.nextInt();
		
		System.out.println(s.grade1 + " grade in " + s.school1 + " School");
		System.out.println(s1.grade1 + " grade in " + s1.school1 + " School");
	}

}
