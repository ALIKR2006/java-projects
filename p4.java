import java.util.Scanner;

public class p4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    do {
      System.out.print("N: ");
      n = sc.nextInt();
    } while (n < 1 || n > 10000);

    int max = 0;
    for (int x = 1; x <= n; x++) {
      int cnt = 0;
      for (int d = 1; d <= x; d++)
        if (x % d == 0)
          cnt++;
      if (cnt > max)
        max = cnt;
    }

    for (int x = 1; x <= n; x++) {
      int cnt = 0;
      for (int d = 1; d <= x; d++)
        if (x % d == 0)
          cnt++;
      if (cnt == max) {
        System.out.println(x + " " + cnt);
        for (int d = 1; d <= x; d++)
          if (x % d == 0)
            System.out.print(d + " ");
        System.out.println();
      }
    }
  }
}