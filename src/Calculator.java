import java.util.Scanner;

public class Calculator {
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

  static int calculate(int first, String operator, int second) {
    int result = 0;
    if (operator.equals("+")){
      result = first + second;
      System.out.println("덧셈: " + result);
    } else if(operator.equals("-")){
      result = first - second;
      System.out.println("뺄셈: " + result);
    } else if(operator.equals("*")) {
      result = first * second;
      System.out.println("곱셈: " + result);
    } else if(operator.equals("/")) {
      result = first / second;
      System.out.println("나눗셈: " + result);
    } else
      System.out.println("사칙연산 기호가 아닙니다.");
    return result;
  }

  static void print(int result) {
    System.out.println("최종 결과 값: " + result);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int first = getFirstValue(scanner);

    int result = first;
    while (true) {
      String operator = getSymbol(scanner);

      if (operator.equals("quit")) {
        print(result) ;
        break;
      }
      int second = getSecondValue(scanner);

      result = calculate(result, operator, second);
    }
  }
}