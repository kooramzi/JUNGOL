import java.util.Scanner;

public class JO199 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		Students[] stuArr = new Students[num];
		Students temp;

		for (int i = 0; i < num; i++) {
			stuArr[i] = new Students(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
			stuArr[i].sum();
		}

		for (int i = 0; i < num; i++) {
			for (int j = num - 1; j > 0; j--) {
				if (stuArr[j].sum > stuArr[j - 1].sum) { //총점이 높은순으로 정렬
					temp = stuArr[j - 1];
					stuArr[j - 1] = stuArr[j];
					stuArr[j] = temp;
				}
			}
		}

		sc.close();

		for (int i = 0; i < stuArr.length; i++) {
			stuArr[i].print();
		}

	}

}

class Students {
	String name;
	int[] scoreArr;
	int sum;

	public Students(String name, int score1, int score2, int score3) {
		this.name = name;
		this.scoreArr = new int[] { score1, score2, score3 };
	}

	public int sum() {
		for (int j = 0; j < scoreArr.length; j++) {
			sum += scoreArr[j];
		}

		return sum;
	}

	void print() {
		System.out.println(name + " " + scoreArr[0] + " " + scoreArr[1] + " " + scoreArr[2] + " " + sum);
	}
}