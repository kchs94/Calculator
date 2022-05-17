import java.util.Scanner;

public class Calculator {
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

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int first = Input.getFirstValue(scanner);

    int result = first;
    while (true) {
      String operator = Input.getSymbol(scanner);

      if (operator.equals("quit")) {
        Output.print(result); ;
        break;
      }
      int second = Input.getSecondValue(scanner);

      result = calculate(result, operator, second);
    }
  }
}