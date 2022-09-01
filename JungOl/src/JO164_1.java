
import java.util.Scanner;

public class JO164_1 {

   public static void main(String arg[]) {

      Scanner s = new Scanner(System.in);
      Class c[] = new Class[4];
      for (int i = 0; i < c.length; i++) {
         System.out.print((i + 1) + "class? ");
         c[i] = new Class(s.nextInt(), s.nextInt(), s.nextInt());
      }
      s.close();
      for (int i = 0; i < c.length; i++) {
         System.out.println((i + 1) + "class : " + c[i].sum);
      }
   }
}

class Class {
   int p1;
   int p2;
   int p3;
   int sum;

   public Class(int p1, int p2, int p3) {
      this.p1 = p1;
      this.p2 = p2;
      this.p3 = p3;
      sum = p1 + p2 + p3;
   }
}