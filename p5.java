import java.util.Scanner;
import java.util.Locale; // پایین توضیح دادم

public class p5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    scanner.useLocale(Locale.US); // برای من موقع ورودی گرفتن "." رو نمیشناخت

    int num;
    float grade;
    int passed = 0;
    int failed = 0;
    float avarage = 0;

    do {
      System.out.println("How many Students? ");
      num = scanner.nextInt();
    } while (num <= 0);

    Std students[] = new Std[num];

    for (int i = 0; i < num; i++) {
      do {
        System.out.println("Student " + (i + 1) + " grade(0.0 - 20.0): ");
        grade = scanner.nextFloat();
      } while (grade < 0 || grade > 20);

      students[i] = new Std((i + 1), grade);

      if (grade >= 10) {
        passed++;
      } else {
        failed++;
      }
    }

    float bestGrade = students[0].Grade;
    float worstGrade = students[0].Grade;

    for (int i = 0; i < num; i++) {
      avarage += students[i].Grade;

      if (bestGrade < students[i].Grade)
        bestGrade = students[i].Grade;
      if (worstGrade > students[i].Grade)
        worstGrade = students[i].Grade;
    }

    avarage /= num;

    System.out.println("Avarage grade of class: " + avarage);
    System.out.println("best grade: " + bestGrade);
    System.out.println("worst grade: " + worstGrade);
    System.out.println("passed: " + passed + " | failed: " + failed);

    scanner.close();

  }
}

class Std {
  int SId;
  float Grade;
  String Status;

  public Std(int id, float grade) {
    SId = id;
    Grade = grade;
    Status = (Grade >= 10) ? "passed" : "failed";
  }
}