import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class JO618 {
	private String name;
	private int height;
	private double weight;

	public JO618(String name, int height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public String getName() {
		return name;
	}

	public void print() {
		System.out.println(name + " " + height + " " + weight);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		JO618[] p = new JO618[5];

		for (int i = 0; i < p.length; i++) {
			String name = sc.next();
			int height = sc.nextInt();
			double weight = sc.nextDouble();

			p[i] = new JO618(name, height, weight); // 바로 생성자에 넣어준다.
		}

		// 이름순으로
		System.out.println("name");
		Arrays.sort(p, new Comparator<JO618>() { //정렬 기준
			public int compare(JO618 o1, JO618 o2) {
				String w1 = o1.getName();
				String w2 = o2.getName();

				return w1.compareTo(w2);
			}
		});
		for (int i = 0; i < p.length; i++) {
			p[i].print();
		}

		// 몸무게 무거운 순으로
		System.out.println("\nweight");
		Arrays.sort(p, new Comparator<JO618>() {
			public int compare(JO618 o1, JO618 o2) {
				double w1 = o1.getWeight();
				double w2 = o2.getWeight();

				if (w1 - w2 > 0)
					return -1;
				else if (w1 - w2 == 0)
					return 0;
				else
					return 1;
			}
		});

		for (int i = 0; i < p.length; i++) {
			p[i].print();
		}

	}

}
