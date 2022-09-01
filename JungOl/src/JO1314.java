
import java.util.Scanner;

public class JO1314 {

   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int arr[][] = new int[n][n];
      int c1 = 65;
      

      for (int i = 0; i < n; i++) {
         if (i % 2 == 0) {
            for (int j = 0; j < n; j++) {
               arr[j][i] = c1++;
               if (c1 > 90) {
                  c1 = 65;
               }
            }
         } else {
            for (int j = n - 1; j >= 0; j--) {
               arr[j][i] = c1++;
               if (c1 > 90) {
                  c1 = 65;
               }
            }
         }
      }

      for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
            System.out.print((char) arr[i][j] + " ");
         }
         System.out.println();
      }
   }

}