import java.util.Scanner;

public class JO572 {

	class Circle572 {
		private int r;

		public Circle572(int r) {
			this.r = r;
		}

		public double getArea(int r) {
			double area = this.r * this.r * 3.14;

			return area;
		}
	}

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int r = sc.nextInt();
		
		Circle572 c= new Circle572();
		double d = c.getArea();
		System.out.println("%.2f",area);
		
		
	}

}
