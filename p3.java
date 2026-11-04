import java.util.Scanner;

public class p3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    float totalPrice;
    float personsCount;
    float sharePrice;

    try {
      System.out.println("How much is application total price?: ");
      totalPrice = Float.parseFloat(scanner.nextLine());

      System.out.println("How many people are buying share?: ");
      personsCount = Float.parseFloat(scanner.nextLine());

      if (personsCount == 0) {
        throw new IllegalArgumentException("you need atleast 1 person to buy application share!");
      }

      if (totalPrice < 0 || personsCount < 0) {
        throw new IllegalArgumentException("persons count and total price must be a positive number!");
      }

      sharePrice = totalPrice / personsCount;
      System.out.println("Each share is: " + String.valueOf(sharePrice) + " toman");
    }

    catch (NumberFormatException e) {
      System.out.println("invalid input, please enter numbers only!");
    }

    catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }

  }
}
