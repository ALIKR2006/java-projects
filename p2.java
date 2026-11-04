import java.util.Scanner;

public class p2 {
  static Scanner scanner = new Scanner(System.in);

  static boolean default_status = true;
  static Boolean notifs_situation = default_status;
  static Integer user_choise = null;

  static void chooseOption() {
    Boolean repeat;

    System.out.println("(Notifications Setting)");
    System.out.println("choose an option: ");
    System.out.println("\t(1) active notifs");
    System.out.println("\t(2) disable notifs");
    System.out.println("\t(3) see notifs current status");
    System.out.println("\t(4) change to default");

    user_choise = Integer.parseInt(scanner.nextLine());

    switch (user_choise) {
      case 1:
        notifs_situation = true;
        System.out.println("Notifications are activated");
        break;

      case 2:
        notifs_situation = false;
        System.out.println("Notifications are disabled");
        break;

      case 3:
        if (notifs_situation == true) {
          System.out.println("Notifications are active");
        } else {
          System.out.println("Notifications are inactive");
        }
        break;

      case 4:
        notifs_situation = default_status;
        System.out.println("Notifications status changed to default(enable)");
        break;

      default:
        System.out.println("onknown option! you must enter an option between(1, 4)");
        break;
    }

    System.out.println("if you want adjust more settings enter (y) , otherwise enter anything else");
    if (scanner.nextLine().equals("y")) {
      repeat = true;
    } else {
      repeat = false;
    }

    if (repeat) {
      chooseOption();
    } else {
      return;
    }
  }

  public static void main(String[] args) {
    chooseOption();

  }
}