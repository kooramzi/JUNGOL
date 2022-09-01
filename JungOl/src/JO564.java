import java.util.Scanner;

public class JO564 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      char c;
      boolean b = true;
      int[] cnt = new int[26];
      do {
         c = sc.next().charAt(0);
         if ('A' <= c && c <= 'Z') {
//            System.out.println(c - 'A');
            cnt[c - 'A']++;
         } else {
            b = false;
         }
      } while (b);
      sc.close();

      for (int i = 0; i < cnt.length; i++) {
         if (cnt[i] != 0) {
            System.out.printf("%c : %d\n", (i + 'A'), cnt[i]);
         }
      }
   }
}