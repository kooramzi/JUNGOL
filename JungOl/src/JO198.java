import java.util.Scanner;

public class JO198 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int f_height = sc.nextInt();
		double f_weight = sc.nextDouble();
		int m_height = sc.nextInt();
		double m_weight = sc.nextDouble();

		Parent f = new Parent(f_height, f_weight);
		Parent m = new Parent(m_height, m_weight);

//		f.print();
//		m.print();

		int myHeight = 0;
		double myWeight = 0;

		myHeight = (f.getHeight() + m.getHeight()) / 2 + 5;
		myWeight = (f.getWeight() + m.getWeight()) / 2 - 4.5;

		System.out.println("height : " + myHeight + "cm");
		System.out.printf("weight : %.1fkg\n", myWeight);
	}
}

class Parent {
	private int height;
	private double weight;

	public Parent(int height, double weight) {
		this.height = height;
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

	public void print() {
		System.out.println(height + " " + weight);
	}

}
