import java.util.Scanner;

public class JO1840 {
   public static void main(String[] args) {
      // ���������
      int n;
      int m;
      int[][] cheese;
      boolean[][] visit;

      // ����� ġ�� �ð� �ټ�
      int timeResult = 0;
      int cheeseResult = 0;

      // �Էº�
      Scanner sc = new Scanner(System.in);
      n = sc.nextInt();
      m = sc.nextInt();
      cheese = new int[n][m];
      visit = new boolean[n][m];

      for (int i = 0; i < n; i++) {
         for (int j = 0; j < m; j++) {
            cheese[i][j] = sc.nextInt();
         }
      }
      sc.close();

      // ġ�� �迭�� ġ� ���� ��� ġ��äũ�ǽ�
      int temp = cheeseCount(cheese);
      ;
      // �켱 �ӽú����� ġ� �ִ��� Ȯ���� 1���̻� ���� �� �ݺ��ؼ� ġ� ����������.
      while (temp > 0) {
         // ġ���� ����� ��� ���ϴ��� �����ִ� �޼����.
         printCheese(timeResult, cheese);
         // ġ���� ����� �ñ��ҽ� ����غ���.

         timeResult++; // ��� ����Ǵ��� ī��Ʈ�ϴ� ������.
         cheeseResult = temp; // �������� ġ� �󸶳� �����ִ��� Ȯ���ϴ� ������.

         visit = new boolean[n][m];
         // �湮 Ȯ�ο� �Ҹ� �迭�� �ʱ�ȭ ����� �Ѵ�.
         check_cheese(0, 0, cheese, visit);

         temp = cheeseCount(cheese);
      }

      // ��º�
      System.out.println(timeResult);
      System.out.println(cheeseResult);
   }

   // ġ�� äũ ��� �޼���
   static void check_cheese(int x, int y, int[][] cheese, boolean[][] visit) {
      // �̹� �������� ��� pass
      if (visit[x][y])
         return;
      // ���� ��ǥ x,y�� �湮������ ����
      visit[x][y] = true;

      // �ֺ��� Ž���ؼ� ġ���� ��� ����� ����
      // ����Ž��
      if (x - 1 >= 0) {
         airMeetCheese(x - 1, y, cheese, visit);
      }
      // �Ʒ���Ž��
      if (x + 1 < cheese.length) {
         airMeetCheese(x + 1, y, cheese, visit);
      }
      // ����Ž��
      if (y - 1 >= 0) {
         airMeetCheese(x, y - 1, cheese, visit);
      }
      // ������Ž��
      if (y + 1 < cheese[0].length) {
         airMeetCheese(x, y + 1, cheese, visit);
      }
      // [�߿�]
      // ��ġ�� �̸� ����ϰ� ���� �迭 �ʰ������� �����ʴ´�.
   }

   // ġ� �󸶳� �����ִ��� Ȯ�� �ϴ� �޼���
   static int cheeseCount(int[][] arr) {
      int result = 0;

      for (int i = 0; i < arr.length; i++) {
         for (int j = 0; j < arr[i].length; j++) {
            if (arr[i][j] == 1)
               result++;
         }
      }

      return result;
   }

   // ġ��迭 �׸��� �׷��ִ� �޼����.
   static void printCheese(int n, int[][] arr) {
      System.out.println(n + 1 + " ȸ�� ������...");

      for (int i = 0; i < arr.length; i++) {
         for (int j = 0; j < arr[i].length; j++) {
            if (arr[i][j] == 0)
               System.out.print("�� ");
            else
               System.out.print("�� ");
         }
         System.out.println();
      }
      System.out.println();
   }

   static void airMeetCheese(int x, int y, int[][] cheese, boolean[][] visit) {
      // ġ���� ���� ���
      if (cheese[x][y] == 1) {
         cheese[x][y] = 0;
         visit[x][y] = true;
      }
      // ġ� ���� ���
      else {
         // �湮 ���� �ʾ������ �湮�Ѵ�.
         if (!visit[x][y])
            check_cheese(x, y, cheese, visit);
      }
   }
}