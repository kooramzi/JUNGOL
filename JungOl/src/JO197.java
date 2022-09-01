import java.util.Scanner;

public class JO197 {
   static Rect[] r;
   
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      r = new Rect[2];
      for (int i = 0; i < r.length; i++) {
         int x1 = sc.nextInt();
         int y1 = sc.nextInt();
         int x2 = sc.nextInt();
         int y2 = sc.nextInt();
         r[i] = new Rect(x1, y1, x2, y2);
      }
      sc.close();

//      for (int i = 0; i < r.length; i++) {
//         r[i].print();
//      }
      
      minxy();
   }
   
   public static void minxy() {
      Point[] p0 = r[0].getPoint();
      Point[] p1 = r[1].getPoint();
      System.out.print(Math.min(p0[0].getX(), p1[0].getX()) + " ");
      System.out.print(Math.min(p0[0].getY(), p1[0].getY()) + " ");
      System.out.print(Math.max(p0[1].getX(), p1[1].getX()) + " ");
      System.out.println(Math.max(p0[1].getY(), p1[1].getY()));
   }
}

class Rect {
   private Point[] p; // p[0] = 좌측하단, p[1] = 우측상단

   public Rect(int x1, int y1, int x2, int y2) {
      p = new Point[2];
      p[0] = new Point(x1, y1);
      p[1] = new Point(x2, y2);
   }

   public void print() {
      for (int i = 0; i < p.length; i++) {
         p[i].print();
      }
   }
   
   public Point[] getPoint() {
      return p;
   }
}

class Point {
   int x, y;

   public Point(int x, int y) {
      this.x = x;
      this.y = y;
   }

   public void print() {
      System.out.println(x + " " + y);
   }
   
   public int getX() {
      return x;
   }
   
   public int getY() {
      return y;
   }
}