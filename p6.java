import java.util.Scanner;

public class p6 {

  static long balance = 1000000;
  static long amount;
  static int transaction = 0;

  static public void viewbalance() {
    System.out.println("balance: " + balance + " toman");
    System.out.println("");
  }

  static public void deposit() {
    balance += amount;
    System.out.println("success " + amount + " toman be hesab ezafe shod");
    viewbalance();
    transaction++;
  }

  static public void withdraw() {
    balance -= amount;
    System.out.println("success " + amount + " toman az hesab kam shod");
    viewbalance();
    transaction++;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int option = -1;
    boolean repeat = true;

    System.out.println("<<faghat adad sahih vared konid (toman)>>");

    while (repeat) {
      do {
        System.out.println("(gozine mored nazar ra entekhab konid)(1 - 4)");
        System.out.println("(1) Balance");
        System.out.println("(2) Deposit");
        System.out.println("(3) Withdraw");
        System.out.println("(4) Exit");

        option = scanner.nextInt();
      } while (option < 0 || option > 4);

      switch (option) {
        case 1:
          viewbalance();
          break;

        case 2:
          do {
            System.out.println("mablagh ra vared konid: ");
            amount = scanner.nextLong();
          } while (amount <= 0);

          deposit();
          break;

        case 3:
          do {
            System.out.println("mablagh ra vared konid: ");
            amount = scanner.nextLong();
          } while (amount <= 0 || amount > balance);

          withdraw();
          break;

        case 4:
          repeat = false;
          System.out.println("Successful Transactions: " + transaction);
          break;

        default: // نیازی نیست ولی میزارم باشه
          break;
      }
    }
    scanner.close();
  }
}
