import java.util.Scanner;

class Circle572 {
	private int r;

	public Circle572(int r) {
		this.r = r;
	}

	public double getArea(int r) {
		double area = this.r * this.r * 3.14;

		System.out.printf("%.2f", area);
		return area;
	}
}

public class JO572 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();

		Circle572 c = new Circle572(r);
		c.getArea(r);

	}

}

//import java.util.Scanner;
//
//class Circle {
//
//   void initData(int r) {
//      double area = r * r * 3.14;
//      System.out.printf("%.2f", area);
//   }
//}
//
//public class J572 {
//   public static void main(String[] args) {
//      Scanner sc = new Scanner(System.in);
//      int r = sc.nextInt();
//      
//      Circle c = new Circle();
//      c.initData(r);
//      sc.close();
//   }
//}
