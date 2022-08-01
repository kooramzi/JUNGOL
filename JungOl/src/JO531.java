import java.util.Scanner;

public class JO531 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double kg = s.nextDouble();

		if (kg <= 50.80d)
			System.out.println("Flyweight");
		else if (kg <= 61.23d)
			System.out.println("Lightweight");
		else if (kg <= 72.57d)
			System.out.println("Middleweight");
		else if (kg <= 88.45d)
			System.out.println("Cruiserweight");
		else
			System.out.println("Heavyweight");
		s.close();
	}

}
