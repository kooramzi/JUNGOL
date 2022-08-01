import java.util.Scanner;

class StuScore {
	String name;
	int kor;
	int eng;
	
	public StuScore(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	
	public void print() {
		System.out.println(name + " " + kor + " " + eng);
	}
}
public class JO615 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			StuScore[] arr = new StuScore[2];

			for (int i = 0; i < arr.length; i++) {
				String name = sc.next();
				int kor = sc.nextInt();
				int eng = sc.nextInt();

				arr[i] = new StuScore(name, kor, eng);

			}
			sc.close();

			for (int i = 0; i < arr.length; i++)
				arr[i].print();
			System.out.println("avg " + (arr[0].kor + arr[1].kor) / arr.length + " " 
								+ (arr[0].eng + arr[1].eng) / arr.length);

		}
	}

