import java.util.Scanner;

public class Input {
  static int getFirstValue(Scanner scanner) {
    System.out.print("첫 번째 값 입력: ");
    int first = scanner.nextInt();
    return first;
  }

  static String getSymbol(Scanner scanner) {
    System.out.print("사칙연산 +,-,*,/ 중 하나를 입력하세요: ");
    String op = scanner.next();
    return op;
  }

  static int getSecondValue(Scanner scanner) {
    System.out.print("두 번째 값 입력: ");
    int second = scanner.nextInt();
    return second;
  }
}
