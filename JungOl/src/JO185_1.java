import java.util.Scanner;

public class JO185_1 {

   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      String string = sc.next();
      int r = string.indexOf(sc.next());
      sc.close();

      if (r == -1)
         System.out.println("No");
      else
         System.out.println(r);

   }
}