
import java.util.Scanner;

public class JO185 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str = sc.next();
      char c = sc.next().charAt(0);
      sc.close();

//      System.out.println(str + " " + c);

      boolean b = false;
      for (int i = 0; i < str.length(); i++) {
         if (str.charAt(i) == c) {
            System.out.println(i);
            b = true;
            break;
         }
      }
      if (!b) {
         System.out.println("No");
      }
   }
}