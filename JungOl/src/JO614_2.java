import java.util.Scanner;

public class JO614_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String schoolName = sc.next();
		int grade = sc.nextInt();
		sc.close();
		
		Sttudent stu1 = new Sttudent();
		Sttudent stu2 = new Sttudent(schoolName, grade);
		
		stu1.print();
		stu2.print();

	}

}

class Sttudent {
	private String schoolName;
	private int grade;

	public Sttudent() {
		schoolName = "Jejuelementary";
		grade = 6;
	}

	public Sttudent(String schoolName, int grade) { // set��ſ� ������
		this.schoolName = schoolName;
		this.grade = grade;
	}

	public void print() { // get��� ����Ʈ�޼���
		System.out.println(grade + " grade in " + schoolName + " School");
	}
}
