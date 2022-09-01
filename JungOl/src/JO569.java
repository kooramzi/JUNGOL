
import java.util.Scanner;

public class JO569 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int cnt = 0;
      for (int i = 0; i < 5; i++) {
         int sum = 0;
         for (int j = 0; j < 4; j++) {
            sum += sc.nextInt();
         }
         if (sum / 4 >= 80) {
            System.out.println("pass");
            cnt++;
         } else {
            System.out.println("fail");
         }
      }
      sc.close();
      System.out.println("Successful : " + cnt);
   }
}