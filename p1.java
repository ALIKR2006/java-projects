import java.util.Scanner;

public class p1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int gig_price = 5000;
    Integer credit = null;
    Integer package_size = null;
    int credit_remaining;

    try {
      System.out.println("how much is your wallet credit?(toman): ");
      credit = Integer.parseInt(scanner.nextLine());

      System.out.println("how many gigabytes do you want your internet package to be?: ");
      package_size = Integer.parseInt(scanner.nextLine());

      if (credit <= 0 || package_size <= 0) {
        throw new IllegalArgumentException("Values must be greater than zero!");
      }

    } catch (NumberFormatException e) {
      System.out.println("Invalid input! Please enter numbers only.");
      return;

    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
      return;
    }

    if ((credit - (package_size * gig_price)) >= 0) {
      credit_remaining = credit - (package_size * gig_price);
      System.out.println("Sucess , " + String.valueOf(package_size) + " gigabytes purchesed");
      System.out.println("credit remaining: " + String.valueOf(credit_remaining) + " toman");
    } else {
      System.out.println("credit is not enough!\n" + "you need " + String.valueOf((package_size * gig_price) - credit)
          + " toman more!");
    }

  }
}